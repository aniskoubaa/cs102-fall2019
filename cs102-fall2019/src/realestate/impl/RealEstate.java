package realestate.impl;

import realestate.interfaces.IRealEstate;

public class RealEstate implements IRealEstate{
    private String id;
    private String name;
    private double surface;
    
    private double price;
    
    public RealEstate(String id, String name, double surface)
    {
        setId(id);
        setName(name);
        setSurface(surface);
    }
    
    public RealEstate(RealEstate rs)
    {
        this(rs.getId(), rs.getName(), rs.getSurface());
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        if(surface > 0)
            this.surface = surface;
        else throw new IllegalArgumentException("Incorrect Surface");
    }
    
    @Override
    public String toString()
    {
        return String.format("“id” : “%s” , “name” : “%s”, “surface” : “%.2f”", getId(), getName(), getSurface());
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        if (price > 0.0)
            this.price = price;
        else throw new IllegalArgumentException("Incorrect Price");
    }

    @Override
    public int compareTo(IRealEstate realEstate) {
        if (this.price>realEstate.getPrice())
            return 1;
        else if (this.price<realEstate.getPrice())
            return -1;
        return 0;
    }
    
    

}
