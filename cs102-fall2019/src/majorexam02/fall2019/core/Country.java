
package majorexam02.fall2019.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import majorexam02.fall2019.interfaces.IAddress;
import majorexam02.fall2019.interfaces.ICity;
import majorexam02.fall2019.interfaces.ICityFactory;
import majorexam02.fall2019.interfaces.ICountry;
import majorexam02.fall2019.interfaces.ILocation2D;


public class Country implements ICountry {
    
    Map<String,IAddress> cities = new HashMap <String,IAddress>();
    ICityFactory cf = CityFactory.getInstance();
    
    String name = null;
    
    public Country(String name){
        this.name = name;
        cities = new HashMap <String,IAddress>();
    }
    

    @Override
    public ICity getCityByName(String name) {
        return (ICity)cities.get(name.toLowerCase());
    }
    
    /****** QUESTION 1: loadFromFile(String file) ****/
    
    @Override
    public void loadFromFile(String file) {
        Scanner input=null;
        try {
            input = new Scanner(new File(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Country.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (input.hasNext()){
            String line = input.next();
            String [] cityArray = line.split(";");
            City c = (City)cf.getCity(cityArray[0]);
            //System.out.println(cities);
            cities.put(c.getName().toLowerCase(),c);            
        }
    }
    
    /**********************************************************/

    
    /****** QUESTION 2: saveToFile(String file) ****/
    @Override
    public void saveToFile(String file) {
        FileWriter fw=null;
        try {
            fw = new FileWriter(new File (file));
            for (IAddress city:cities.values()){
                fw.write(((City)city).getName()+";"
                        +((ILocation2D)(city.getLocation())).getX()+";"
                        +((ILocation2D)(city.getLocation())).getY()+"\n");
            }
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Country.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    
    public void saveToFile2(String file) {
        FileWriter fw=null;
        try {
            fw = new FileWriter(new File (file));
            for (String city :cities.keySet()){
                fw.write(city+";"
                        +((GPS)(cities.get(city).getLocation())).getLat()+";"
                        +((GPS)(cities.get(city).getLocation())).getLon()+"\n");
            }
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Country.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    /**********************************************************/
       
    
   public Map<String, Double> distanceMap (String cityName){
       Iterator <String> it = cities.keySet().iterator();
       Map<String, Double> dm = new TreeMap<String, Double>();
       while (it.hasNext()){
           String nextCity = it.next();
           City c1 = (City)cities.get(cityName);
           City c2 = (City)cities.get(nextCity);
           if (!nextCity.equalsIgnoreCase(cityName)){
               dm.put(nextCity, GPSDistanceCalculator.distance(c1.getLocation(), c2.getLocation(), "K"));
           }           
       }
       return dm;       
   }
   
   
      
    
    @Override
    public void displayCities() {
        Iterator <IAddress> it = this.getCities().iterator();
        while(it.hasNext()){
            System.out.print(((City)(it.next())).getName()+";");
        }
        System.out.println("");
    }

    @Override
    public void displayCitiesName() {
        for (IAddress city: this.getCities()){
            System.out.print(((City)(city)).getName()+"; ");
        }
        System.out.println("");
    }

    @Override
    public Collection<IAddress> getCities() {
           return cities.values();
    }
}
