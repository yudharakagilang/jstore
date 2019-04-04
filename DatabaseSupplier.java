/**
 * Kelas ini berfungsi sebagai database dari supplier, bisa juga menambahkan dan menghapus
 * supplier pada database dan mengembalikan nilainya serta menampilkan data dari databasenya
 *
 * @author Gilang Yudharaka
 * @version 28 Februari 2019
 */
public class DatabaseSupplier{
    private Supplier[] listSupplier;
    private Supplier supplier;


    /**
     * Constructor for objects of class DatabaseItem
     */
    
    public DatabaseSupplier()
    {
    }
       /**
     * Method ini digunakan untuk menambahkan supplier kedalam database
     * 
     * @return boolean true
     * @param supplier
     */
    public boolean addSupplier(Supplier supplier){
    	return true;
    }
     /**
     * Method ini digunakan untuk menghapus supplier dari database database supplier
     * @return boolean true
     * @param supplier
     */
    public boolean removeSupplier(Supplier supplier){
    	return true;
    }
     /**
     * Method ini berfungsi untuk mengembalikan nilai supplier
     * 
     * @return objek supplier
     */
    public Supplier getSupplier(){
    	return supplier;
    }
       /**
     * method yang digunakan untuk mereturn list supplier
     * 
     * @return list supplier
     */
    public Supplier[] getListSupplier(){
    	return listSupplier;
    }
}