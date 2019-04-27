package jstore;
/**
 * Write a description of class JStore here.
 *
 * @author Gilang Yudharaka
 * @version 28 Februari 2019
 */
import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

public class JStore{
    
    public static void main(String[] args){



        Location lokasi1 = new Location("Jawa Barat", "Bogor", "Goks");

        try {
            //Create 3 Supplier
            DatabaseSupplier.addSupplier(new Supplier("gilangy1", "gilang@gmail.com", "081310275391", lokasi1));
            DatabaseSupplier.addSupplier(new Supplier("gilangy2", "gilang1@gmail.com", "081310275392", lokasi1));
            DatabaseSupplier.addSupplier(new Supplier("gilangy3", "gilang2@gmail.com", "081310275393", lokasi1));
        } catch (SupplierAlreadyExistsException e) {
            e.getExMessage();
        }



        try {
            DatabaseItem.addItem(new Item(" HP 1", 1000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
            DatabaseItem.addItem(new Item(" HP 2", 2000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(2)));
            DatabaseItem.addItem(new Item(" HP 3", 3000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(3)));
            DatabaseItem.addItem(new Item(" HP 4", 4000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
        } catch (ItemAlreadyExistsException e) {
            e.getExMessage();
        }

        for (Supplier supplierPtr : DatabaseSupplier.getSupplierDatabase()){
            System.out.println(supplierPtr);
        }

        for (Item itemPtr : DatabaseItem.getItemDatabase()){
            System.out.println(itemPtr);
        }




        SpringApplication.run(JStore.class, args);


    }

       /**
     * Constructor for objects of class JStore
     */
    
    
    public JStore(){   
      
    }
}
