
/**
 * Write a description of class Transaction here.
 *
 * @author Gilang
 * @version  */

import java.util.*;
public class Transaction
{


    public static void orderNewItem(ArrayList<Integer> item_list){
        try {
            DatabaseInvoice.addInvoice(new Buy_Paid(item_list));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

    }

    public static void orderSecondItem (ArrayList<Integer> item_list){
        try {
            DatabaseInvoice.addInvoice(new Buy_Paid(item_list));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
    }
    public static void orderRefurbishedItem(ArrayList<Integer> item_list){
        try {
            DatabaseInvoice.addInvoice(new Buy_Paid(item_list));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }


    }
    public static void sellItemPaid(ArrayList<Integer> item_list, Customer customer){
        try {
            DatabaseInvoice.addInvoice(new Sell_Paid(item_list, customer));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
    }
    public static void sellItemUnpaid(ArrayList<Integer> item_list, Customer customer){
        try {
            DatabaseInvoice.addInvoice(new Sell_Unpaid(item_list, customer));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

    }
    public static void sellItemInstallment(ArrayList<Integer> item_list, Customer customer, int installmentPeriod){
        try {
            DatabaseInvoice.addInvoice(new Sell_Installment(item_list, installmentPeriod, customer));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

    }

    public static boolean finishTransaction(Invoice invoice)
    {
        if(invoice.getInvoiceStatus().equals(InvoiceStatus.Installment)
                && invoice.getInvoiceStatus().equals(InvoiceStatus.Unpaid)){
            for (Invoice invoiceDB : DatabaseInvoice.getInvoiceDatabase()){
                if (invoiceDB.getId() == invoice.getId()) {
                    invoice.setisActive(false);
                    System.out.println("Invoice Status : " + invoice.getisActive());
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean cancelTransaction(Invoice invoice)
    {
        if(invoice.getInvoiceStatus().equals(InvoiceStatus.Installment)
                && invoice.getInvoiceStatus().equals(InvoiceStatus.Unpaid)){
            for (Invoice invoiceDB : DatabaseInvoice.getInvoiceDatabase()) {
                if (invoiceDB.getId() == invoice.getId()) {
                    try {
                        DatabaseInvoice.removeInvoice(invoice.getId());
                    } catch (InvoiceNotFoundException e) {
                        System.out.println(e.getExMessage());
                    }
                    return true;
                }
            }
        }
        return false;
    }


}
