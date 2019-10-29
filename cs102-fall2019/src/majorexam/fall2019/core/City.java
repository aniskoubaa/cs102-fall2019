package majorexam.fall2019.core;

import majorexam.fall2019.interfaces.IAddress;
import majorexam.fall2019.interfaces.ICity;
import majorexam.fall2019.interfaces.ILocation;

public class City implements ICity{
    
    private String name;
    private GPS location;
    private String country;

    public City(String name, GPS location, String country) {
        this.name = name;
        this.location = location;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GPS getLocation() {
        return location;
    }

    public void setLocation(GPS location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    @Override
    public String toString() {
        return String.format("%s, %s, (%s)", this.getName(), this.getCountry(),
                this.getLocation());
    }

    

    @Override
    public void setLocation(ILocation location) {
        if (location instanceof GPS){
            this.location=(GPS)location;
        }else throw new IllegalArgumentException("location must be GPS");
    }

    @Override
    public int compareTo(ICity c) {
        return this.getLocation().compareTo(c.getLocation());
    }

    
    
}

