package majorexam02.fall2019.core;

import java.io.IOException;
import majorexam02.fall2019.interfaces.ICountry;


public class CountryTest {
    public static void main (String[] args) throws IOException{
        
        ICountry saudiArabia = new Country("Saudi Arabia");
        saudiArabia.loadFromFile("saudiarabia.txt");
        saudiArabia.displayCities();
        
        System.out.println(((Country)saudiArabia).distanceMap("jeddah"));
        
        
        //System.out.println(((Country)saudiArabia).getRandomRoute());
        
    }
    
}
