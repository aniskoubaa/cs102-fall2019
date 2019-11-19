package realestate.impl;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import realestate.interfaces.IRealEstate;
import realestate.interfaces.IRealEstateCompany;
/*
In the class RealEstateTest, write a test class that:
Creates a new RealEstateCompany
Load all the data from the real_estate.csv file.
Display the number of
Homes
Apartments
Terrain
Display the average price of
Homes
Apartments
Terrain
Provide the result of the execution of the program.


*/


public class RealEstateTest 
{
    public static void main(String[] args) {
        
        RealEstateCompany re = RealEstateCompany.getInstance();
        Map<String, Integer> counter = new TreeMap<String, Integer>();
        Map<String, Double> priceMap = new TreeMap<String, Double>();
        
        try {
            re.loadRealEstates2("real_estates.csv");
            
            for (IRealEstate e : re.getRealEstates()){
                
                if (e instanceof Home){
                    if (!counter.containsKey("home")){
                        counter.put("home", 1);
                        priceMap.put("home", e.getPrice());
                    }else{
                        counter.put("home", counter.get("home")+1);
                        priceMap.put("home", priceMap.get("home")+e.getPrice());
                    }
                }
                
                if (e instanceof Apartment){
                    if (!counter.containsKey("apartment")){
                        counter.put("apartment", 1);
                        priceMap.put("apartment", e.getPrice());
                    }else{
                        counter.put("apartment", counter.get("apartment")+1);
                        priceMap.put("apartment", priceMap.get("apartment")+e.getPrice());
                    }
                }
                
                if (e instanceof Terrain){
                    if (!counter.containsKey("terrain")){
                        counter.put("terrain", 1);
                        priceMap.put("terrain", e.getPrice());
                    }else{
                        counter.put("terrain", counter.get("terrain")+1);
                        priceMap.put("terrain", priceMap.get("terrain")+e.getPrice());
                    }
                }

            }
            
            
            priceMap.put("apartment", priceMap.get("apartment")/counter.get("apartment"));
            priceMap.put("home", priceMap.get("home")/counter.get("home"));
            priceMap.put("terrain", priceMap.get("terrain")/counter.get("terrain"));
            
            System.out.println(counter);
            System.out.println(priceMap);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RealEstateTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}

