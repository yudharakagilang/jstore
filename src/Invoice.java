
import java.util.Calendar;
/**
 * Kelas ini berfungsi untuk membuat invoice dari setiap transaksi. Invoice akan dibuat pada setiap
 * id transaks. Terdapat juga informasi seperti  nama ite m , tanggal dan total
 * harga yang ditransaksikan
 *
 * @author Gilang Yudharaka
 * @version 28 Februari 2019
 */
import java.util.ArrayList;


abstract public class Invoice{
    private int id;
   // private Item item;
    //private String date;
    private int totalPrice;
    //private int totalItem;
    private Calendar date;
    private boolean isActive;
    private Customer customer;
    private ArrayList<Integer> item=new ArrayList<Integer>();

    


    //private InvoiceStatus status;
    //private InvoiceType type;



       /**
     * Constructor for objects of class Invoice
     * 
     * @param id
     * @param name
     * @param date
     * @param totalPrice
     */

    public Invoice(ArrayList<Integer> item ){  
        //this.id=  
      /*  this.id=id;
        this.item=item;
        this.totalItem=totalItem;
        setTotalPrice(totalItem*item.getPrice());
        this.date= Calendar.getInstance();
        */

        this.item=item;
        this.id=DatabaseInvoice.getLastInvoiceID()+1;

    
    }
    
        /**
     * Method yang digunakan untuk mereturn nilai id invoice
     * 
     * @return int id invoice
     */
    public int getId(){
        return id;
    }
    /**
     * Method yang digunakan untuk mereturn nilai item yang dibeli
     * 
     * @return objek item item invoice
     */

    public ArrayList<Integer> getItem(){
     return item;
    }

    /**
     * Method yang digunakan untuk mereturn tanggal invoice
     * 
     * @return String tanggal invoice
     */
    
    public Calendar getDate(){
        return date;
    }
      /**
     * Method yang digunakan untuk mereturn nilai harga invoice
     * 
     * @return int totalPrice invoice
     */
    public int getTotalPrice(){
        return totalPrice;
    }

    //public InvoiceStatus status(){
     //   return status;
    //}

    /*public int getTotalItem(){
        return totalItem;
    }*/

    public boolean getisActive(){
        return isActive;
    }
    public Customer getCustomer(){
        return customer;
    }
       /**
     * Method yang digunakan untuk mengubah nilai id invoice
     * 
     * @param id adalah parameter untuk method setId
     */
    public abstract InvoiceStatus getInvoiceStatus();
   

    public abstract InvoiceType getInvoiceType();
   
    public void setId(int id){
        this.id=id;
    }
    

    /**
     * Method yang digunakan untuk mengubah item pada invoice
     * 
     * @param item dari objek item adalah parameter untuk method setItem
     */
    


    public void setItem(ArrayList<Integer> item ){
        id=DatabaseInvoice.getLastInvoiceID()+1;
        this.item = item;

    }

       /**
     * Method yang digunakan untuk mengubah tanggal invoice
     * 
     * @param date adalah parameter untuk method setDate
     */
    
    public void setDate(Calendar date){
        this.date=date;
    }
    

     /**
     * Method yang digunakan untuk mengubah total harga di invoice
     * 
     * @param totalPrice adalah parameter untuk method setTotalPrice
     */

    public void setTotalPrice(int totalPrice){
        for(Integer invoice : item)
        {
            //this.totalPrice=this.totalPrice+DatabaseItem.getItemFromID(invoice).getPrice();
        }
    }

    /*public void setTotalItem(int totalItem){
        this.totalItem=totalItem;
    }
    */
    public void setisActive(boolean isActive){
        this.isActive=isActive;
    }
    
    public abstract void setInvoiceStatus(InvoiceStatus status);

      /**
     * Method yang digunakan untuk mencetak total harga dari invoice
     * 
     */
    
    public abstract void printData();
    
     public abstract String toString();
 

        
    
}