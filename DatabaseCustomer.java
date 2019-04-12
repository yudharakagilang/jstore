import java.util.ArrayList;
/**
 * Write a description of class DatabaseCostumer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
    private static ArrayList<Customer> CUSTOMER_DATABASE= new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID=0;
      
    public DatabaseCustomer()
    {
        
    }
    
     /**
     * method ini digunakan untuk menambah costumer kedalam database
     *
     * @return boolean true
     */
    
    public static boolean addCustomer(Customer customer)
    {
        boolean found = false;
        for(Customer temp : CUSTOMER_DATABASE)
        {
            if(temp.getName() == customer.getName() && temp.getEmail() 
            == customer.getEmail())
            {
                return false;
            }
        }
        CUSTOMER_DATABASE.add(customer);
        LAST_CUSTOMER_ID = customer.getId();
        return true;
    }
       /**
     * method ini digunakan untuk menghapus costumer kedalam database
     *
     * @return boolean true
     */
    public static ArrayList<Customer> getCustomerDatabase(){
        //return customer;
        return CUSTOMER_DATABASE;
    }

    public static boolean removeCustomer(int id)
    {
        for(Customer temp : CUSTOMER_DATABASE) 
        {
            if(temp.getId() == id) 
            {
                CUSTOMER_DATABASE.remove(temp);
                return true;
            }
        }
        return false;
    
    }
    
     /**
     * Method yang digunakan untuk mereturn nilai costumer
     * 
     * @return objek costumer
     */
    
    public static Customer getCustomer(int id){
        Customer value=null;
        for(Customer customer : CUSTOMER_DATABASE)
        {
            if(customer.getId()==id)
            {
                value=customer;
            }
        }
        return value;
     // customer;
    }
    /**
     * Method yang digunakan untuk mereturn nilai dari database costumer
     * 
     * @return list costumer
     */
    public static int getLastCustomerID(){
        //return listCustomer;
        return LAST_CUSTOMER_ID;
    }
    
    
}