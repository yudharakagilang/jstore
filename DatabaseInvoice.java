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

    public static  boolean addInvoice(Invoice invoice){
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID=invoice.getId();
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

    public static Invoice getActiveOrder(Customer customer){
        for(Invoice temp : INVOICE_DATABASE) 
        {
            if((temp.getInvoiceStatus() == InvoiceStatus.Unpaid || 
            temp.getInvoiceStatus() == InvoiceStatus.Installment) && 
            temp.getisActive() == true) 
            {
                return temp;
            }
        }
        return null;
    }
  
    
    public static boolean removeInvoice(int id){
        for(Invoice temp : INVOICE_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                if(temp.getisActive() == true) 
                {
                    temp.setisActive(false);
                    INVOICE_DATABASE.remove(temp);
                    return true;
                }
            }
        }
        return false;
    }
    }
