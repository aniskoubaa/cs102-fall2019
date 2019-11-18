/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.major02.spring2018.core;

import exams.major02.spring2018.interfaces.Humidity;
import exams.major02.spring2018.interfaces.Database;
import exams.major02.spring2018.interfaces.Distance;
import exams.major02.spring2018.interfaces.GPS;
import exams.major02.spring2018.interfaces.Measurement;
import exams.major02.spring2018.interfaces.Pressure;
import exams.major02.spring2018.interfaces.Sensor;
import exams.major02.spring2018.interfaces.SensorFactory;
import exams.major02.spring2018.interfaces.Temperature;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class IoTApp {
    
    Database <Measurement> db = DatabaseImpl.getInstance();
    SensorFactory sf = new SensorFactoryImpl();
    Set<String> cities = new TreeSet<String>();
    
     /*** Task 1: loadData Method **/
    public void loadData(String filename) {
/*
Riyadh;24.7136;46.6753;41.09;C;21.65;p;1022.93;mb;27.50;m;01/01/2018
Jeddah;21.2854;39.2376;30.43;C;33.59;p;1246.85;mb;23.70;m;01/01/2018

[Riyadh,
 24.7136,
 46.6753
 ...       
 ...    
01/01/2018        
        ]
        
*/  

/*
Date date, String cityName, GPS gps, Set<Sensor> sensors
*/
        
        try {
            Scanner sc = new Scanner (new File(filename));
            
            while (sc.hasNextLine()){
                
                String line = sc.nextLine();
                String [] items = line.split(";");
                
                String cityName = items[0];
                double lat = Double.parseDouble(items[1]);
                double lng = Double.parseDouble(items[2]);
                GPS gps = new GPSImpl(lat, lng);
                
                String dateStr = items[11]; //       01/01/2018
                String [] dateArray = dateStr.split("/");
                int day = Integer.parseInt(dateArray[0]);
                int month = Integer.parseInt(dateArray[1]);
                int year = Integer.parseInt(dateArray[2]);
                Date date = new Date(day, month, year);
                
                Set<Sensor> sensors = new TreeSet<Sensor>();
    /*Riyadh;24.7136;46.6753;41.09;C;
                21.65;p;
                1022.93;mb;
                27.50;m;
                01/01/2018*/
                
                double temp = Double.parseDouble(items[3]);
                String tempUnit = items[4];
                
                double pressure = Double.parseDouble(items[5]);
                String pressureUnit = items[6];
                
                double humidity = Double.parseDouble(items[7]);
                String humidityUnit = items[8];
                
                double distance = Double.parseDouble(items[9]);
                String DistanceUnit = items[10];
                    
             sensors.add(sf.getSensor("temperature", tempUnit,temp));
             sensors.add(sf.getSensor("humidity", humidityUnit,humidity));
             sensors.add(sf.getSensor("distance", DistanceUnit,distance));
             sensors.add(sf.getSensor("pressure", pressureUnit,pressure));
   /*
Date date, String cityName, GPS gps, Set<Sensor> sensors
*/          
             Measurement m = new MeasurementImpl(date, cityName, gps, sensors);
              db.storeElement(m);
              cities.add(cityName);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        
        
    }


    
    /*** Task 2 Filter by Date and City **/
    /*
    Write the method
public Set<Measurement> FilterByDateAndCity (String cityName, Date dmin, Date dmax)
that returns the set of measurement for a city specified by its name cityName and 
    in the range [dmin, dmax].
If the cityName is equal to “all”, it returns all the measurements for 
    all cities in the range [dmin, dmax].
If the cityName does not exist in the cities Set, then the method throws an exception.
Use withinDateInterval() method.
    */
   public Set<Measurement> FilterByDateAndCity (String cityName, Date dmin, Date dmax){
       
       Set<Measurement> mSet = new HashSet<Measurement>();
       
       Iterator <Measurement> it = db.getDB().iterator();
       
       while (it.hasNext()){
           Measurement m = it.next();
           if (cities.contains(cityName)){
               boolean c1 = m.getCityName().equalsIgnoreCase(cityName);
               boolean c2 = withinDateInterval(m.getDate(), dmin, dmax);
               
               if (c1 && c2)
                   mSet.add(m);            
               
           }else if (cityName.equalsIgnoreCase("all")){
               if (withinDateInterval(m.getDate(), dmin, dmax))
                   mSet.add(m);
           } else throw new IllegalArgumentException("error");
           
       }
       return mSet;
       
   } 
    
    
    
    /*** Task 4  maxTemperature  **/ 
    
   
   public double maxTemperature (String cityName, Date d1, Date d2){
       
       Set<Measurement> set = FilterByDateAndCity(cityName, d1, d2);
       
       
       Measurement m = Collections.max(set, new MeasurementTemperatureComparator());
       
       for (Sensor s : m.getSensors()){
           if (s instanceof Temperature)
               return s.getValue();
       }
       
       return 0;
   }
   
    
    
    public boolean withinDateInterval(Date d, Date d1, Date d2){
        if (d1.compareTo(d2)<0){
            if ((d.compareTo(d1)>=0)&&(d.compareTo(d2)<=0)){
                return true;
            }
        }
        if (d1.compareTo(d2)>0){   
            if ((d.compareTo(d1)<=0)&&(d.compareTo(d2)>=0)){
                return true;
            }
        }
        return false;
    }
    
   
    
    
    
    
    
    
    
}
