
package majorexam02.fall2019.interfaces;

import java.util.Collection;


public interface ICountry {
    
    
    public abstract void loadFromFile(String file);
    public abstract void saveToFile(String file);
        
    public abstract Collection<IAddress> getCities();
    
    public abstract void displayCities();
    public abstract void displayCitiesName();
    
    public ICity getCityByName(String name);
    
}
