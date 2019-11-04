package assignment14;

public class MobilePhoneProduct extends ElectronicProduct implements IProduct{
    
    public static final String [] brands = {"Samsung", "iPhone", "Huawei"};
    
    public MobilePhoneProduct(int id, String label, double price, String brand){
        super(id, label, price, brand);
        setBrand(brand);
    }
    
    @Override
    public void setBrand(String brand){
        for (String b : brands){
            if (brand.equals(b)){
                //super.brand=brand;
                super.setBrand(brand);
                break;
            }      
        }
    }
    
    @Override
    public String toString(){
        return String.format("MobilePhoneProduct{%s}", super.toString());
    }

    @Override
    public String getPID() {
       return String.format("%d",getID());
    }

    @Override
    public String getInfo() {
        return toString();
    }
    
}
