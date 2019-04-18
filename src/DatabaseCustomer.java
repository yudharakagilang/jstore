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
    
    public static boolean addCustomer(Customer customer) throws CustomerAlreadyExistsException {
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customer.getName()==customerDB.getName()||customer.getEmail()==customerDB.getEmail())
            {
                throw new CustomerAlreadyExistsException(customer);
            }
        }
        CUSTOMER_DATABASE.add(customer);
        LAST_CUSTOMER_ID=customer.getId();
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

    public static boolean removeCustomer(int id) throws CustomerNotFoundException {
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId()==id)
            {
                CUSTOMER_DATABASE.remove(id);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
    
    }
    
     /**
     * Method yang digunakan untuk mereturn nilai costumer
     * 
     * @return objek costumer
     */
    
    public static Customer getCustomer(int id){
        for (Customer customer : CUSTOMER_DATABASE){
            if (customer.getId() == id ){
                return customer;
            }
        }
        return null;
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