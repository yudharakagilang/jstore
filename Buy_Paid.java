
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

public class Buy_Paid extends Invoice
{
    
    private static final InvoiceType INVOICE_TYPE= InvoiceType.Buy;
    private static final InvoiceStatus INVOICE_STATUS= InvoiceStatus.Paid;
    private boolean isActive;


    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(ArrayList<Integer> item)
    {
        super(item);
        this.isActive=false;

      
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
    
    public void printData(){
       /* System.out.println("==========INVOICE=======");
        System.out.println("ID :" + getId());
        System.out.println("Date :" + getDate());
        System.out.println("Item yang terdapat :" + getItem().getName());
        System.out.println("Total harga :" + getTotalPrice());
        System.out.println("Status :" + getInvoiceStatus());*/
    }
    
   public String toString() {
    setTotalPrice(0);
    for (int temp1 : this.getItem())
    {
        System.out.println(DatabaseItem.getItemFromID(temp1).toString());
    }
     
    SimpleDateFormat sdf = new SimpleDateFormat ("dd MMMMM yyyy");

      return "\n========INVOICE========" +
             "\nID: " +  getId() + 
             "\nBuy date: " + sdf.format(getDate().getTime()) +       
             "\nTotal price: " + getTotalPrice() +
             "\nStatus: " + InvoiceStatus.Paid + 
             "\nSell Success\n";
 }
    

public void setInvoiceStatus(InvoiceStatus status){
    
    }
}
