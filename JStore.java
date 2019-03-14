
/**
 * Write a description of class JStore here.
 *
 * @author Gilang Yudharaka
 * @version 28 Februari 2019
 */
public class JStore{
    
    public static void main(String[] args){
        Location location1 = new Location("DKI Jakarta", "Jakarta", "Haha");
        Supplier supplier1 = new Supplier(1, "Gilang Yudharkaa", "gilangyudharaka21@gmail.com", "087874825283", location1);      
        
        location1.printData();
        supplier1.printData();
        
        Transaction.orderNewItem(supplier1);
        Transaction.sellItemPaid(DatabaseItem.itemDB);
        Transaction.orderSecondItem(supplier1);
        Transaction.sellItemUnpaid(DatabaseItem.itemDB);
        Transaction.orderRefurbishedItem(supplier1);
        Transaction.sellItemInstallment(DatabaseItem.itemDB);
        
    }

       /**
     * Constructor for objects of class JStore
     */
    
    public JStore(){
      
    }
}
