package jstore;
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Sell_Installment extends Invoice
{
    private static final InvoiceType INVOICE_TYPE= InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS=InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive=true;
    



    public Sell_Installment(ArrayList<Integer> item, int installmentPeriod, Customer customer)
    {
        super(item);
        setisActive(true);
        this.installmentPeriod=installmentPeriod;
        this.customer=customer;
        this.setTotalPrice();

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

        int tempTotalHarga=0;
        for (int itemPtr : this.getItem())
        {
            tempTotalHarga=tempTotalHarga+DatabaseItem.getItemFromID(itemPtr).getPrice();
        }

        double tempInstallmentPrice = (tempTotalHarga/installmentPeriod)*1.02;
        installmentPrice = (int) tempInstallmentPrice;
        super.totalPrice=installmentPrice*installmentPeriod;
    } 
    
    public void setCustomer(Customer customer){
    this.customer=customer;
    }

    public void printData(){
       
    }
    
     public String toString() {

         System.out.println("++++++++++++ SELL INSTALLMENT ++++++++++++++++++");
        setTotalPrice();
       for (int temp1 : this.getItem())
       {
           System.out.println(DatabaseItem.getItemFromID(temp1).toString());
       }
        
       SimpleDateFormat sdf = new SimpleDateFormat ("dd MMMMM yyyy");
	 return	 "\n========INVOICE========" +
	 	     "\n Invoice ID: " +  getId()+
             "\nCustomer ID: " + customer.getId() +
             "\nCustomer Name: " + customer.getName() +
		     "\nBuy date: " + sdf.format(getDate().getTime()) +
		     "\nInstallment price: " + installmentPrice +
             "\nStatus: " + this.isActive +
             "\nInstallment period: " + installmentPeriod+
             "\n===== END OF INVOICE ===";
		

    }
    
    public void setInvoiceStatus(InvoiceStatus status){
    
    }
    
}

