package realestate.interfaces;


public interface IRealEstate extends Comparable<IRealEstate>{

    public abstract String getId();
    public abstract void setId(String id);
    public abstract String getName();
    public abstract void setName(String name);
    public abstract double getSurface();
    public abstract void setSurface(double surface);
    
    public abstract double getPrice();
    public abstract void setPrice(double price);
    
}
