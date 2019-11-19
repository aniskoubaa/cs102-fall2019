package realestate.impl;

import realestate.interfaces.IApartment;
import realestate.interfaces.IRealEstate;

public class Apartment extends RealEstate implements IApartment {
    private int numberOfRooms;
    private int number;
    private int floorNumber;
    
    public Apartment(String id, String name, double surface, int numberOfRooms, int number, int floorNumber)
    {
        super(id, name, surface);
        setId(id);
        setNumberOfRooms(numberOfRooms);
        setNumber(number);
        setFloorNumber(floorNumber);
    }
    
    public Apartment(Apartment ap)
    {
        this(ap.getId(), ap.getName(), ap.getSurface(), ap.getNumberOfRooms(), ap.getNumber(), ap.getFloorNumber());
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        if(numberOfRooms >= 0)
            this.numberOfRooms = numberOfRooms;
        else throw new IllegalArgumentException("Incorrect number of rooms.");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number >= 0)
            this.number = number;
        else throw new IllegalArgumentException("Incorrect number.");
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        if(floorNumber >= 0)
            this.floorNumber = floorNumber;
        else throw new IllegalArgumentException("Incorrect floor number");
    }
    
    @Override
    public void setId(String id)
    {
        String chars = id.substring(1);
        id = id.toUpperCase();
        //if(id.startsWith("A") && chars.length() == 5)
            super.setId(id);
        //else throw new IllegalArgumentException("Incorrect Id");
    }

    @Override
    public String toString()
    {
        return String.format("{“type” : “appartment”, %s, “number”:” %d”, “number_of_rooms”:”%d”, “floor_number”: “%d” } \n", super.toString(), getNumber(), getNumberOfRooms(), getFloorNumber());
    }
    

    
    
    
}

