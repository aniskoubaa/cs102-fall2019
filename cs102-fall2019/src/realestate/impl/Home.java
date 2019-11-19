package realestate.impl;

import realestate.interfaces.IHome;

public class Home extends RealEstate implements IHome{
    private int numberOfRooms;
    private  boolean hasGarage;
   
    
    public Home(String id, String name, double surface, int numberOfRooms, boolean hasGarage)
    {
        super(id, name, surface);
        setId(id);
        setNumberOfRooms(numberOfRooms);
        setHasGarage(hasGarage);
    }
    
    public Home(Home h)
    {
        this(h.getId(), h.getName(), h.getSurface(), h.getNumberOfRooms(), h.getHasGarage());
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        if(numberOfRooms >= 0)
            this.numberOfRooms = numberOfRooms;
        else throw new IllegalArgumentException("Incorrect number of rooms.");
    }

    public boolean getHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }
    
    
    
    @Override
    public void setId(String id)
    {
        String chars = id.substring(1);
        id = id.toUpperCase();
        //if(id.startsWith("H") && chars.length() == 4 )
            super.setId(id);
        //else throw new IllegalArgumentException("Incorrect Id");
    }
    
    @Override
    public String toString()
    {
        return String.format("{“type” : “home”, %s, “number_of_rooms”:” %d”, “has_garage”:“%b” }", getNumberOfRooms(), getHasGarage());
    }
    
    
}

