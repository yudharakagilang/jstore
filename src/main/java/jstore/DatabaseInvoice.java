package jstore;
/**
 * Merupakan Class DatabaseInvoice.
 *
 */

import java.util.ArrayList;
public class DatabaseInvoice
{
    // variabel yang digunakan dalam class
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID=0;
    
    /**
     * Method of class DatabaseInvoice
     * @return true
     */
    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;

    }

    public static int getLastInvoiceID(){
        return LAST_INVOICE_ID;
    }


    public static boolean addInvoice(Invoice invoice) throws InvoiceAlreadyExistsException {
        for (Invoice temp : INVOICE_DATABASE ) {
            if(((temp.getItem().equals(invoice.getItem())))){
                throw new InvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID = invoice.getId();
        return true;
    }
    public static Invoice getInvoice(int id){
        Invoice value=null;
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getId()==id)
            {
                value=invoice;
            }
        }
        return value;

    }
    public static ArrayList<Invoice> getActiveOrder(Customer customer) throws CustomerDoesntHaveActiveException {
        ArrayList<Invoice> invoice_list = new ArrayList<Invoice>();
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if( (invoice.getCustomer() == customer)  && (invoice.getInvoiceStatus() == InvoiceStatus.Unpaid) || (invoice.getInvoiceStatus() == InvoiceStatus.Installment) ){
                invoice_list.add(invoice);
            }
        }
        if(invoice_list != null){
            return invoice_list;
        }
        else{
            throw new CustomerDoesntHaveActiveException(customer);
        }
    }
  
    
    public static boolean removeInvoice(int id) throws InvoiceNotFoundException {
        for(Invoice invoice : INVOICE_DATABASE){
            if(invoice.getId() == id){
                if (invoice.getisActive() == true) {
                    invoice.setisActive(false);
                }
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
//        return false;
    }

  
    }
