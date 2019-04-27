package jstore;
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
    public int totalPrice;
    private Calendar date;
    private boolean isActive;
    private Customer customer;
    private ArrayList<Integer> item=new ArrayList<Integer>();

    


    //private InvoiceStatus status;
    //private InvoiceType type;




    public Invoice(ArrayList<Integer> item ){  


        this.item=item;
        this.id=DatabaseInvoice.getLastInvoiceID()+1;
        this.date=Calendar.getInstance();

    
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
        //id=DatabaseInvoice.getLastInvoiceID()+1;
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
    



    public void setTotalPrice(){
        int tempTotalHarga=0;
        for (int itemPtr : this.getItem())
        {
            tempTotalHarga=tempTotalHarga+DatabaseItem.getItemFromID(itemPtr).getPrice();
        }
        this.totalPrice=tempTotalHarga;
    }


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