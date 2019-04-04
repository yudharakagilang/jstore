import java.util.Calendar;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    
    private InvoiceType INVOICE_TYPE=InvoiceType.Buy;
    private InvoiceStatus INVOICE_STATUS=InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;


    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Unpaid(int id, Item item, int totalItem, Customer customer)
    {
         super(id, item, totalItem);
        this.customer=customer;
        this.dueDate = Calendar.getInstance();
        this.dueDate.add(Calendar.DATE, +1);
      
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
        return "===== Invoice =====" + "ID: " + this.getId() + "Item: " + this.getItem().getName() + "Amount:"
                + this.getTotalItem() + "Buy Date: " + this.getDate() + "Price: " + this.getItem().getPrice()
                + "Price total: " + this.getTotalPrice() + "Supplier ID: " + this.getItem().getSupplier().getId()
                + "Supplier name: " + this.getItem().getSupplier().getName() + "Customer ID: "
                + this.getCustomer().getId() + "Customer name: " + this.getCustomer().getName() + "Status: "
                + this.INVOICE_STATUS + "Due date: " + this.dueDate
                + "If payment is not received by due date, transcation will be canceled";
}
    
    

    public void printData(){
        System.out.println("==========INVOICE=======");
        System.out.println("ID :" + getId());
        System.out.println("Date :" + getDate());
        System.out.println("Item yang terdapat :" + getItem().getName());
        System.out.println("Total harga :" + getTotalPrice());
        System.out.println("Status :" + getInvoiceStatus());
        System.out.println("dueDate :" + getDueDate());
    }
    
    public void setInvoiceStatus(InvoiceStatus status){
    
    }
 

}
