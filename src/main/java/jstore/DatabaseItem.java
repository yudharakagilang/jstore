package jstore;

/**
 * Class DatabaseItem digunakan untuk menambahkan, , ataupun mengembalikan nilai  item pada suatu database
 * 
 *
 * @author Gilang Yudharaka
 * @version 28 Februari 2019
 */
import java.util.ArrayList;
public class DatabaseItem
{
    //public String listItem[];
    //private Item item;
   // public static Item itemDB;
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<Item>();
    private static int LAST_ITEM_ID=0;

    public static ArrayList<Item> getItemDatabase(){
        return ITEM_DATABASE;

    }

    public static int getLastItemID(){
        return LAST_ITEM_ID;
    }

    public static boolean addItem(Item item)throws ItemAlreadyExistsException{
        boolean found = false;
        for(Item temp : ITEM_DATABASE) 
        {
            if(temp.getName() == item.getName() && temp.getStatus() == item.getStatus()
            && temp.getSupplier() == item.getSupplier()) 
            {
                throw new ItemAlreadyExistsException(item);
            }
            }

        ITEM_DATABASE.add(item);
        LAST_ITEM_ID = item.getId();
        return true;
    }
    public static Item getItemFromID(int id){
        Item value=null;
        for(Item itemDB2 : ITEM_DATABASE)
        {
            if(itemDB2.getId()==id)
            {
                value=itemDB2;
            }
        }
        return value;
    }
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier){
        ArrayList<Item> value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getSupplier()==supplier)
            {
                value.add(itemDB);
            }
        }
        return value;

    }
    public static ArrayList<Item> getItemFromCategory(Item category){
        ArrayList<Item> value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getCategory()==category.getCategory())
            {
                value.add(itemDB);
            }
        }
        return value;
    }
    
    public static ArrayList<Item> getItemFromStatus(ItemStatus status){
        ArrayList<Item> value=null;
        for(Item  itemDB : ITEM_DATABASE)
        {
            if(itemDB.getStatus()==status)
            {
                value.add(itemDB);
            }
        }   
        return value;
    }
    
    public static boolean removeItem(int id)throws ItemNotFoundException{

        boolean value=false;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId()==id)
            {
                ITEM_DATABASE.remove(id);
                value=true;
            }
        }
        throw new ItemNotFoundException(id);
    }


    }



 

