package assignment14;

public class ElectronicProduct extends Product {
    
    private String brand;
    
    public ElectronicProduct(int id, String label, 
            double price, String brand){
        super (id, label, price);
        setBrand(brand);
    }
    
    public void setBrand(String brand){
        this.brand=brand;
    }
    
    public String getBrand(){
        return brand;
    }
    
    
    
}
