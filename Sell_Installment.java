
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


    public Sell_Installment(int id, Item item, String date, int totalPrice, int totalItem, int installmentPeriod)
    {
        super(id, item, date, totalPrice,totalItem);

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
        totalPrice=installmentPrice*installmentPeriod;
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
}
