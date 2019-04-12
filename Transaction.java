
/**
 * Write a description of class Transaction here.
 *
 * @author Gilang
 * @version  */

import java.util.*;
public class Transaction
{
    public static void orderNewItem(Item item){
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
       
    }

    public static void orderSecondItem (Item item){
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
    }
    public static void orderRefurbishedItem(Item item){
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
       

    }
    public static void sellItemPaid(Item item, Customer customer){
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Paid(itemID, customer);
        DatabaseInvoice.addInvoice(invoice);
    }
    public static void sellItemUnpaid(Item item, Customer customer){
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Unpaid(itemID,customer);
        DatabaseInvoice.addInvoice(invoice);
    }
    public static void sellItemInstallment(Item item, Customer customer, int installmentPeriod){
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Installment(itemID,installmentPeriod,customer);
        DatabaseInvoice.addInvoice(invoice);
    }

    public boolean finishTransaction(Invoice invoice){
        boolean value=false;
        for (Invoice invoiceDB : DatabaseInvoice.getInvoiceDatabase()){
            if (invoiceDB.getId()==invoice.getId()){
                invoice.setisActive(false);
                System.out.print(invoice.getisActive());
                value=true;
            }
        }
        return value;
    }

    public boolean cancelTransaction(Invoice invoice){
        boolean value=false;
        for (Invoice invoiceDB : DatabaseInvoice.getInvoiceDatabase()){
               if (invoiceDB.getId()==invoice.getId()){
                   DatabaseInvoice.removeInvoice(invoice.getId());
                   value=true;
               }
           }
        return value;
    }



}
