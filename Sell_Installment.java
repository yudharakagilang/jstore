
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    private InvoiceType INVOICE_TYPE;
    private InvoiceStatus INVOICE_STATUS;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;


    public Sell_Installment(int id, Item item,int totalItem, int installmentPeriod, Customer customer)
    {
        super(id,item,totalItem);
        this.installmentPeriod=installmentPeriod;
        this.customer=customer;
        

    }
    
    public Customer getCustomer(){
   return customer;
    }

 
    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }

    
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }

    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }

    public void setInstallmentPrice(int totalPrice)
    {
        installmentPrice=(totalPrice*(102/100))/installmentPeriod;

    }

    public void setTotalPrice()
    {
        //totalPrice=installmentPrice*installmentPeriod;
    } 
    
    public void setCustomer(Customer customer){
    this.customer=customer;
    }

    public void printData(){
        System.out.println("==========INVOICE=======");
        System.out.println("ID :" + getId());
        System.out.println("Date :" + getDate());
        System.out.println("Item yang terdapat :" + getItem().getName());
        System.out.println("Total harga :" + getTotalPrice());
        System.out.println("Status :" + getInvoiceStatus());
        System.out.println("Installment price" + getInstallmentPrice());
    }
    
     public String toString() {
        return "===== Invoice =====" + "ID: " + this.getId() + "Item: " + this.getItem().getName() + "Amount:"
                + this.getTotalItem() + "Buy Date: " + this.getDate() + "Price: " + this.getItem().getPrice()
                + "Price total: " + this.getTotalPrice() + "Supplier ID: " + this.getItem().getSupplier().getId()
                + "Supplier name: " + this.getItem().getSupplier().getName() + "Customer ID: "
                + this.getCustomer().getId() + "Customer name: " + this.getCustomer().getName() + "status: "
                + this.INVOICE_STATUS + "Installment Period: " + this.installmentPeriod + "Sell success";}
    
    public void setInvoiceStatus(InvoiceStatus status){
    
    }
    
}

