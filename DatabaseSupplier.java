/**
 * Kelas ini berfungsi sebagai database dari supplier, bisa juga menambahkan dan menghapus
 * supplier pada database dan mengembalikan nilainya serta menampilkan data dari databasenya
 *
 * @author Gilang Yudharaka
 * @version 28 Februari 2019
 */
/**
 * Merupakan Class DatabaseInvoice.
 *
 */
import java.util.ArrayList;
public class DatabaseSupplier
{
    // variabel yang digunakan dalam class
    private static ArrayList<Supplier> SUPPLIER_DATABASE=new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID=0;
    
    /**
     * Method of class DatabaseInvoice
     * @return true
     */

    public static ArrayList<Supplier> getSupplierDatabase()
    {
        return SUPPLIER_DATABASE;
    }
    
    public static int getLastSupplierID()
    {
        return LAST_SUPPLIER_ID;
    }

    public static boolean addSupplier(Supplier supplier)
    {
      for(Supplier temp : SUPPLIER_DATABASE) 
        {
            if((temp.getName() == supplier.getName()) && 
            (temp.getEmail() == supplier.getEmail()) && 
            (temp.getPhoneNumber() == supplier.getPhoneNumber())) 
            {
                return false;
            }
        }
        SUPPLIER_DATABASE.add(supplier);
        LAST_SUPPLIER_ID = supplier.getId();
        return true;
    }
    public Supplier getSupplier(int id)
    {
        Supplier value=null;
        for(Supplier supplier : SUPPLIER_DATABASE)
        {
            if(supplier.getId()==id)
            {
                value=supplier;
            }
        }
        return value;
    }

    public static boolean removeSupplier(int id)
    {
         for(Supplier temp : SUPPLIER_DATABASE) 
        {
            if(temp.getId() == id)
            {
                DatabaseItem.getItemFromSupplier(temp).clear();
                return true;
            }
        }
        return false;
    }
    
}