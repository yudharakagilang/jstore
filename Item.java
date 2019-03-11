
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
    private int stock;
    private int price;
    private String category;
    private Supplier supplier;
  
    /**
     * Constructor untuk object dari class Item
     *@param name,stock,price,category,supllier
     */

    public Item(int id, String name, int stock, int price, String category, Supplier supplier){
        this.id=id;
        this.name=name;
        this.stock=stock;
        this.price=price;
        this.category=category;
        this.supplier=supplier;
    }
     /**
     * method untuk mereturn id barang
     * @return int id barang
     */
    
    public int getId(){
        return id;
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
    
    public int getStock(){
        return stock;
    }
     /**
     * method untuk mereturn harga barang
     * @return int price barang
     */
    
    public int getPrice(){
        return price;
    }
     /**
     * method untuk mereturn kategori barang
     * @return String category item
     */
    
    public String getCategory(){
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
     * @param stock adalah parameter untuk method setStock
     */
    
    public void setStock(int stock){
        this.stock=stock;
    }
       /**
     * method untuk mengubah harga barang
     * @param price adalah parameter untuk method setPrice
     */

    public void setPrice(int price){
        this.price=price;
    }
     /**
     * method untuk mengubah kategori suatu barang
     * @param category adalah parameter untuk method setCategory
     */

    public void setCategory(String category){
        this.category=category;
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

    public void printData(){
        System.out.println(name);
    }
}
