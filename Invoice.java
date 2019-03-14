/**
 * Kelas ini berfungsi untuk membuat invoice dari setiap transaksi. Invoice akan dibuat pada setiap
 * id transaks. Terdapat juga informasi seperti  nama ite m , tanggal dan total
 * harga yang ditransaksikan
 *
 * @author Gilang Yudharaka
 * @version 28 Februari 2019
 */

public class Invoice{
    private int id;
    private Item item;
    private String date;
    private int totalPrice;
    private int totalItem;
    private InvoiceStatus status;



       /**
     * Constructor for objects of class Invoice
     * 
     * @param id
     * @param name
     * @param date
     * @param totalPrice
     */

    public Invoice(int id, Item item, String date, int totalPrice, InvoiceStatus status){    
        this.id=id;
        this.item=item;
        this.date=date;
        this.totalPrice=totalPrice;
        this.status=status;
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

    public Item getItem(){
     return item;
    }

    /**
     * Method yang digunakan untuk mereturn tanggal invoice
     * 
     * @return String tanggal invoice
     */
    
    public String getDate(){
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

    public InvoiceStatus status(){
        return status;
    }

    public int getTotalItem(){
        return totalItem;
    }
       /**
     * Method yang digunakan untuk mengubah nilai id invoice
     * 
     * @param id adalah parameter untuk method setId
     */

    public void setId(int id){
        this.id=id;
    }
    

    /**
     * Method yang digunakan untuk mengubah item pada invoice
     * 
     * @param item dari objek item adalah parameter untuk method setItem
     */
    


    public void setItem(Item item){
        this.item=item;
    }

       /**
     * Method yang digunakan untuk mengubah tanggal invoice
     * 
     * @param date adalah parameter untuk method setDate
     */
    
    public void setDate(String date){
        this.date=date;
    }
    

     /**
     * Method yang digunakan untuk mengubah total harga di invoice
     * 
     * @param totalPrice adalah parameter untuk method setTotalPrice
     */

    public void setTotalPrice(int totalPrice){
        this.totalPrice=totalPrice;
    }

    public void setTotalItem(int totalItem){
        this.totalItem=totalItem;
    }
    public void setInvoiceStatus(InvoiceStatus status){
        this.status=status;
    }

      /**
     * Method yang digunakan untuk mencetak total harga dari invoice
     * 
     */
    
    public void printData(){
        System.out.println(totalPrice);
    }
}