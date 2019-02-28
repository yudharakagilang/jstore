public class DatabaseSupplier{
    private String listSupplier[];
    private Supplier supplier;

    public DatabaseSupplier(){
    }
    
    public boolean addSupplier(Supplier supplier){
    	return true;
    }
    
    public boolean removeSupplier(Supplier supplier){
    	return true;
    }
    
    public Supplier getSupplier(){
    	return supplier;
    }

    public String[] getListSupplier(){
    	return listSupplier;
    }
}