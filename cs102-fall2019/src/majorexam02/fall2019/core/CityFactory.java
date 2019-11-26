package majorexam02.fall2019.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import majorexam02.fall2019.interfaces.ICity;
import majorexam02.fall2019.interfaces.ICityFactory;

public class CityFactory implements ICityFactory{

    static String [] cities = {"Jeddah", "Makkah", "Madinah", "Riyadh"};
    static List<String> citiesNames = Arrays.asList(cities);
    
    private static CityFactory cf = new CityFactory();
    
    public static CityFactory getInstance(){
        return cf;
    }
    
    @Override
    public ICity getCity(String cityName) {
        
        System.out.println(cityName);
       if (cityName.toLowerCase().compareTo("makkah")==0){
           return new City("makkah", new GPS(21.3891, 39.8579, 0.0), "Saudi Arabia");
       }else if (cityName.toLowerCase().compareTo("madinah")==0){
           return new City("madinah", new GPS(24.5247, 39.5692, 0.0), "Saudi Arabia");
       }else if (cityName.toLowerCase().compareTo("jeddah")==0){
           return new City("jeddah", new GPS(21.2854, 39.2376, 0.0), "Saudi Arabia");
       }else if (cityName.toLowerCase().compareTo("riyadh")==0){
           return new City("riyadh", new GPS(24.7136, 46.6753, 0.0), "Saudi Arabia");
       } else if (cityName.toLowerCase().compareTo("boraidah")==0){
           return new City("boraidah", new GPS(26.3592,43.9818, 0.0), "Saudi Arabia");
       }else if (cityName.toLowerCase().compareTo("aljouf")==0){
           return new City("aljouf", new GPS(29.8874,39.3206, 0.0), "Saudi Arabia");
       }else if (cityName.toLowerCase().compareTo("riyadh")==0){
           return new City("tabouk", new GPS(24.7136, 46.6753, 0.0), "Saudi Arabia");
       }else if (cityName.toLowerCase().compareTo("yunbu")==0){
           return new City("yunbu", new GPS(24.0232,38.1900, 0.0), "Saudi Arabia");
       }else if (cityName.toLowerCase().compareTo("taif")==0){
           return new City("taif", new GPS(21.4373,40.5127, 0.0), "Saudi Arabia");
       }else if (cityName.toLowerCase().compareTo("abha")==0){
           return new City("abha", new GPS(18.2465,42.5117, 0.0), "Saudi Arabia");
       }else if (cityName.toLowerCase().compareTo("jizan")==0){
           return new City("jizan", new GPS(16.8894,42.5706, 0.0), "Saudi Arabia");
       }else if (cityName.toLowerCase().compareTo("albaha")==0){
           return new City("albaha", new GPS(20.0217,41.4713, 0.0), "Saudi Arabia");
       }else if (cityName.toLowerCase().compareTo("najran")==0){
           return new City("najran", new GPS(17.5656,44.2289, 0.0), "Saudi Arabia");
       }else if (cityName.toLowerCase().compareTo("qatif")==0){
           return new City("qatif", new GPS(26.5765,49.9982, 0.0), "Saudi Arabia");
       }else if (cityName.toLowerCase().compareTo("dhahran")==0){
           return new City("dhahran", new GPS(26.2361,50.0393, 0.0), "Saudi Arabia");
       }else if (cityName.toLowerCase().compareTo("khobar")==0){
           return new City("khobar", new GPS(26.2172,50.1971, 0.0), "Saudi Arabia");
       }else if (cityName.toLowerCase().compareTo("dammam")==0){
           return new City("dammam", new GPS(26.3927,49.9777, 0.0), "Saudi Arabia");
       }else if (cityName.toLowerCase().compareTo("tabouk")==0){
           return new City("tabouk", new GPS(28.3835,36.5662, 0.0), "Saudi Arabia");
       }
       
       return null;
    }
}



