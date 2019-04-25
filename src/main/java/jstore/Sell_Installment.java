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
    private boolean isActive;
    



    public Sell_Installment(ArrayList<Integer> item, int InstallmentPeriod, Customer customer)
    {
        super(item);
        this.isActive=true;
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
       
    }
    
     public String toString() {
        setTotalPrice(0);
       for (int temp1 : this.getItem())
       {
           System.out.println(DatabaseItem.getItemFromID(temp1).toString());
       }
        
       SimpleDateFormat sdf = new SimpleDateFormat ("dd MMMMM yyyy");
	 return	"\n========INVOICE========" + 
	 	"\nID: " +  getId() + 
//		"\nItem: " + getItem().getName() +
//		"\nAmount: "  + getTotalItem() +
		//"\nBuy date: " + sdf.format(getDate().getTime()) +
//		"\nPrice: " + getItem().getPrice() +
		"\nTotal price: " + getTotalPrice() +
		"\nInstallment price: " + installmentPrice +
//		"\nSupplier ID: " + getItem().getSupplier().getId() +
//		"\nSupplier name: " + getItem().getSupplier().getName() +
		"\nCustomer ID: " + customer.getId() +
		"\nStaus: " + this.isActive +
		"\nCustomer Name: " + customer.getName() +
		"\nStatus: " + InvoiceStatus.Installment + 
		"\nInstallment period: " + installmentPeriod +
		
		"\nSell Success\n";
    }
    
    public void setInvoiceStatus(InvoiceStatus status){
    
    }
    
}

