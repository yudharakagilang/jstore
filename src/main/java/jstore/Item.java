package jstore;
/**
 * Class item digunakan untuk mendaftarkan  barang  pada jstore
 * barang yang didaftarkan pada class ini akan memiliki beberapa atribut seperti  id, nama, stock, harga, kategori
 * dan suppliernya. Pada Class ini terdapat method untuk menSET ataupun mengambil nilai yang telah didtetapkan (get method)
 * 
 *
 * @author Gilang Yudharaka
 * @version 28 Februari 2019
 */
public class Item{

    private int id;
    private String name;
    private int price;
    private ItemCategory category;
    private Supplier supplier;
    private ItemStatus status;
    

  
    /**
     * Constructor untuk object dari class Item
     *@param name,stock,price,category,supllier
     */

    public Item(String name, int price, ItemCategory category, ItemStatus status,  Supplier supplier){
        id=DatabaseItem.getLastItemID()+1;
        this.name=name;
        this.price=price;
        this.category=category;
        this.supplier=supplier;
        this.status=status;

    }
     /**
     * method untuk mereturn id barang
     * @return int id barang
     */
    
    public int getId(){
        return id;
    }
    public ItemStatus getStatus(){
        return status;
    }

    /**
     * method untuk mereturn nama barang
     * @return string name barang
     */

    public String getName(){
        return name;
    }
      /**
     * method untuk mereturn stock barang
     * @return int Stock barang
     */
    

    
    public int getPrice(){
        return price;
    }
     /**
     * method untuk mereturn kategori barang
     * @return String category item
     */
    
    public ItemCategory getCategory(){
        return category;
    }
        /**
     * method untuk mereturn supplier barang
     * @return Supplier supplier item
     */

    public Supplier getSupplier(){
        return supplier;
    }
    
        /**
     * method untuk mengubah id barang
     * @param id adalah parameter untuk method setID
     */
    public void setId(int id){
        this.id=id;
    }
      /**
     * method untuk mengubah nama barang
     * @param name adalah parameter untuk method setName
     */
    public void setName(String name){
        this.name=name;
    }
     /**
     * method untuk mengubah jumlah stock barang

    


    public void setPrice(int price){
        this.price=price;
    }
     /**
     * method untuk mengubah kategori suatu barang
     * @param category adalah parameter untuk method setCategory
     */

    public void setCategory(ItemCategory category){
        this.category=category;
    }
    public void setStatus(ItemStatus status){
        this.status=status;
    }
    /**
     * method untuk mengubah suppliaer barang
     * @param supplier adalah parameter untuk method setSupplier
     */

    public void setSupplier(Supplier supplier){
        this.supplier=supplier;
    }
      /**
     * method untuk menampilkan nama barang
     * 
     */

     public String toString(){
        return "======ITEM=======\nId: "+id+"\nName: "+name+"\nCategory: "+category+"\nStatus: "+status+"\nSupplier: "+supplier.getName();
    



        
        
    }
}
