

/**
 * Class DatabaseItem digunakan untuk menambahkan, , ataupun mengembalikan nilai  item pada suatu database
 * 
 *
 * @author Gilang Yudharaka
 * @version 28 Februari 2019
 */
public class DatabaseItem{
    //public String listItem[];
    //private Item item;
    public static Item itemDB;
    private Item[] listItem;

     /**
     * Constructor for objects of class DatabaseItem
     */

    public DatabaseItem(){
    }
     /**
     * method ini digunakan untuk menambah item kedalam database
     *
     * @return boolean true
     */
    
    public static boolean addItem(Item item){
          //itemDB=item;
        return true;
    }
       /**
     * method ini digunakan untuk menghapus item kedalam database
     *
     * @return boolean true
     */
    
    public boolean removeItem(Item item){
        return true;
    }
     /**
     * Method yang digunakan untuk mereturn nilai item
     * 
     * @return objek item
     */
    
    public Item getItem(){
        return itemDB;
    }
    /**
     * Method yang digunakan untuk mereturn nilai dari database item
     * 
     * @return list item
     */
    public Item[] getItemDatabase(){
        return listItem;
    }
}
