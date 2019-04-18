
/**
 * Write a description of class JStore here.
 *
 * @author Gilang Yudharaka
 * @version 28 Februari 2019
 */
import java.util.ArrayList;
public class JStore{
    
    public static void main(String[] args){
       /**
    
        Location lokasi1= new Location ("jawa barat","Depok","kotatidakhujan");
        DatabaseSupplier.addSupplier(new Supplier ("gilang","gilang@gmail.com","087874825283",lokasi1));
        DatabaseSupplier.addSupplier(new Supplier ("gilang1","gilang1@gmail.com","087874825282",lokasi1));
        DatabaseSupplier.addSupplier(new Supplier ("gilang2","gilang2@gmail.com","087874825281",lokasi1));
        for (Supplier supplier : DatabaseSupplier.getSupplierDatabase()){
            System.out.println(supplier);
        }
        
        
      
        DatabaseCustomer.addCustomer(new Customer ("gilang1","gilang1@gmail.com","gilang1","gilang",1998,1,4));
        DatabaseCustomer.addCustomer(new Customer ("gilang2","gilang2@gmail.com","gilang2","gilang",1998,1,4));
        DatabaseCustomer.addCustomer(new Customer ("gilang3","gilang3@gmail.com","gilang3","gilang",1998,1,4));
        for (Customer customer : DatabaseCustomer.getCustomerDatabase()){
            System.out.println(customer);
        }
        
        DatabaseItem.addItem(new Item ("mouse1",1,ItemStatus.New, 10000,DatabaseSupplier.getSupplier(1),ItemCategory.Furniture));
        DatabaseItem.addItem(new Item ("mouse2",1,ItemStatus.New, 10000,DatabaseSupplier.getSupplier(1),ItemCategory.Furniture));
        DatabaseItem.addItem(new Item ("mouse3",1,ItemStatus.New, 10000,DatabaseSupplier.getSupplier(1),ItemCategory.Furniture));
        DatabaseItem.addItem(new Item ("mouse4",1,ItemStatus.New, 10000,DatabaseSupplier.getSupplier(1),ItemCategory.Furniture));
        for (Item item: DatabaseItem.getItemDatabase()){
            System.out.println(item);
        }
       
       
        ArrayList<Integer> invoice1 = new ArrayList<>();
        invoice1.add(1);
        invoice1.add(2);
         ArrayList<Integer> invoice2 = new ArrayList<>();
        invoice2.add(1);
         ArrayList<Integer> invoice3 = new ArrayList<>();
        invoice3.add(1);
        
        DatabaseInvoice.addInvoice(new Sell_Paid (invoice1,DatabaseCustomer.getCustomer(1)));;
        DatabaseInvoice.addInvoice(new Sell_Unpaid (invoice2,DatabaseCustomer.getCustomer(1)));;
        DatabaseInvoice.addInvoice(new Sell_Installment (invoice3,3 ,DatabaseCustomer.getCustomer(1)));;
          for (Invoice invoice: DatabaseInvoice.getInvoiceDatabase()){
            System.out.println(invoice);
        }

        */
        Location location1 = new Location("jawa", "depok", "location 1");
        try
        {
            DatabaseSupplier.addSupplier(new Supplier("gilang", "gilang@mail.com", "+6288898888888", location1));
            DatabaseSupplier.addSupplier(new Supplier("gilang", "gilang@mail.com", "+6288898888888", location1));
            DatabaseSupplier.addSupplier(new Supplier("gilang", "gilang@mail.com", "+6288898888888", location1));
        }
        catch (SupplierAlreadyExistsException e)
        {
            System.out.println(e.getExMessage());
        }


        
       
    }

       /**
     * Constructor for objects of class JStore
     */
    
    
    public JStore(){   
      
    }
}
