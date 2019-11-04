package assignment14;

public class Product {
    
    private int ID;
    private String label;
    private double price;
    
    private static int count =0;
    
  public Product (int id, String label, double price){
        setID(id);
        setLabel(label);
        setPrice (price);
        count++;
    }
  
      public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "ID=" + ID + ", label=" + label + ", price=" + price + "}\n";
    }
 
}
