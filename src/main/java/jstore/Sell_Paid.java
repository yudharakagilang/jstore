package jstore;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;

public class Sell_Paid extends Invoice
{
    
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive=false;
    


    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
      super(item);
      this.customer=customer;
      setisActive(false);
      this.setTotalPrice();
    }


    public InvoiceStatus getInvoiceStatus()
    {
        // put your code here
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType()
    {
        // put your code here
        return INVOICE_TYPE;
    }
    
    public Customer getCustomer(){
    return customer;
    }
    
    public void setCustomer(Customer customer){
    this.customer=customer;
    }

    public void printData(){
       
    }
    
   public String toString() {

        System.out.println("++++++++++++ SELL PAID ++++++++++++++++++");
        setTotalPrice();
       for (int temp1 : this.getItem())
       {
           System.out.println(DatabaseItem.getItemFromID(temp1).toString());
       }
       SimpleDateFormat sdf = new SimpleDateFormat ("dd MMMMM yyyy");

       return "\n========INVOICE========" +
               "\nID: " +  getId() +
               "\nBuy date: " + sdf.format(getDate().getTime()) +
               "\nTotal price: " + getTotalPrice() +
               "\nInvoice Status: " + this.isActive +
               "\nCustomer ID: " + getCustomer().getId() +
               "\nCustomer Name: " + getCustomer().getName() +
               "\nInvoice Status: " + InvoiceStatus.Paid +
               "\nStatus: " + this.isActive +
               "\nSell Success\n";
}
public void setInvoiceStatus(InvoiceStatus status){
    
    }
}
