import java.util.Calendar;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.text.SimpleDateFormat;
public class Sell_Unpaid extends Invoice
{
    
    private static  InvoiceType INVOICE_TYPE=InvoiceType.Buy;
    private static InvoiceStatus INVOICE_STATUS=InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive;


    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer=customer;
        isActive=true;
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
    public Calendar getDueDate()
    {
        return dueDate;
    }
    
    public Customer getCustomer(){
    return customer;
    }
    
    public void setCustomer(Customer customer){
    this.customer=customer;
    }
    
    public void setDueDate(Calendar dueDate){
    this.dueDate=dueDate;
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
		"\nTotal price: " + getTotalPrice() +
		"\nCustomer ID: " + customer.getId() +
		     "\nStatus: " + this.isActive +
		"\nCustomer Name: " + customer.getName() +
		"\nStatus: " + InvoiceStatus.Unpaid + 
		"\nSell Success\n";
}
    
    

    public void printData(){
       /* System.out.println("==========INVOICE=======");
        System.out.println("ID :" + getId());
        System.out.println("Date :" + getDate());
        System.out.println("Item yang terdapat :" + getItem().getName());
        System.out.println("Total harga :" + getTotalPrice());
        System.out.println("Status :" + getInvoiceStatus());
        System.out.println("dueDate :" + getDueDate());*/
    }
    
    public void setInvoiceStatus(InvoiceStatus status){
    
    }
 

}
