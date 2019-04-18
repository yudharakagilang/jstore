/* * Class ini berfungsi untuk memasukkan lokasi digunakan untuk informasi
 * tambahan pada class lain (supplier)
 *
 * @author Gilang Yudharaka
 * @version 28 February 2019
 */

public class Location{

    private String province;
    private String description;
    private String city;

     /**
     * Constructor for objects of class Location
     */

    public Location(String province, String city, String description){
        this.province=province;
        this.city=city;
        this.description=description;
    }
       /**
     * Method yang digunakan untuk mengembalikan dari nama provinsi
     * 
     * @return String province location
     */
    public String getProvince(){
        return province;
    }
    /**
     * Method yang digunakan untuk mengembalikan deskripsi lokasi
     * 
     * @return String description location
     */
    
    public String getDescription(){
        return description;
    }
      /**
     * Method yang digunakan untuk mengembalikan nama kota
     * 
     * @return String city location
     */
    
    public String getCity(){
        return city;
    }



     /**
     * Method yang digunakan untuk mengubah nilai dari nama provinsi
     * 
     * @param province adalah parameter untuk method setProvince
     */
    
    public void setProvince(String province){
        this.province=province;
    }
     /**
     * Method yang digunakan untuk mengubah deskripsi dari lokasi
     * 
     * @param description adalah parameter untuk method setDescription
     */
    
    public void setDescription(String description){
        this.description=description;
    }
    
     /**
     * Method yang digunakan untuk mengubah nilai dari nama kota
     * 
     * @param city adalah parameter untuk method setCity
     */
    public void setCity(String city){
        this.city=city;
    }
     /**
     * Method yang digunakan untuk mencetak nama provinsi
     * 
     */

     public String toString(){
        return "========LOCATION========\nprovinsi:"+province+"\nkota:"+city+"\ndeskripsi:"+description;
    }
        
    
}