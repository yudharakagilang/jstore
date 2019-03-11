
/**
 * Write a description of class JStore here.
 *
 * @author Gilang Yudharaka
 * @version 28 Februari 2019
 */
public class JStore{
    
    public static void main(String[] args){
        Location location1 =new Location ("Jawab Barat","Bogor","Bebas");
        Supplier supplier1 =new Supplier(1,"Gilang","gilangyudharaka@gamil.com","087874825283",location1);
        Item item1 =new Item (1,"buku",1, 10000,"mantab",supplier1);
        Invoice invoice1=new Invoice (1, item1, "Date", 10000);
        supplier1.setName("Tapor");
        supplier1.printData();
        item1.printData();
        
    }

       /**
     * Constructor for objects of class JStore
     */
    
    public JStore(){
      
    }
}
