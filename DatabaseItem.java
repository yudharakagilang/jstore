

/**
 * Class DatabaseItem digunakan untuk menambahkan, , ataupun mengembalikan nilai  item pada suatu database
 * 
 *
 * @author Gilang Yudharaka
 * @version 28 Februari 2019
 */
public class DatabaseItem{
    private String listItem[];
    private Item item;

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
    
    public boolean addItem(Item item){
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
    	return item;
    }
    /**
     * Method yang digunakan untuk mereturn nilai dari database item
     * 
     * @return list item
     */
    public String[] getItemDatabase(){
    	return listItem;
    }
}
