package realestate.impl;

import java.util.ArrayList;
import realestate.interfaces.IApartment;
import realestate.interfaces.IBuilding;

public class Building extends RealEstate implements IBuilding {
    
    private ArrayList<IApartment> apartments = new ArrayList<>();
    
    public Building(String id, String name)
    {
        super(id, name, 1.1);
        setId(id);
        setSurface();
    }
     
    public ArrayList<IApartment> getApartments() {
        return apartments;
    }
     
     public void setApartments(ArrayList<IApartment> apartments) {
        this.apartments = apartments;
    }
     
     @Override
    public void setId(String id)
    {
        String chars = id.substring(1);
        id = id.toUpperCase();
        if(id.startsWith("B") && chars.length() == 4)
            super.setId(id);
        else throw new IllegalArgumentException("Incorrect Id");
    }
    

    public void setSurface()
    {
        double sum = 0.1;
        for(IApartment a: apartments)
        {
            sum += a.getSurface();
        }
        super.setSurface(sum);
    }

    @Override
    public String toString()
    {
        return String.format("{“type” : “building”, %s, “number_of_apartment” : “%d”}", super.toString(), getNumberOfApartments());
    }
    
    public int getNumberOfApartments()
    {
        return apartments.size();
    }
     
}
