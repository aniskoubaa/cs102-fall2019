package majorexam02.fall2019.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import majorexam02.fall2019.interfaces.IAddress;
import majorexam02.fall2019.interfaces.ICity;
import majorexam02.fall2019.interfaces.IRoute;

public class RouteTest {
    public static void main (String[] args) throws IOException {
         
         
         IRoute route = new Route();
         ICity jeddah = new City("Jeddah", new GPS(21.2854, 39.2376, 1.0), "Saudi Arabia");
         ICity makkah = new City("Makkah", new GPS(21.3891, 39.8579, 1.0), "Saudi Arabia");
         ICity madinah = new City("Madinah", new GPS(24.5247, 39.5692, 1.0),"Saudi Arabia");
         ICity riyadh = new City("Riyadh", new GPS(24.7136, 46.6753, 1.0),"Saudi Arabia");
         
        
         
         System.out.println("Route Length: " + route.getLength());
         ((Route)route).add((City)jeddah);
         
         ((Route)route).add((City)makkah);
         ((Route)route).add((City)madinah);
         ((Route)route).add((City)riyadh);
         ((Route)route).add((City)jeddah);

         System.out.println("Route Length: " + route.getLength());
         System.out.println(route);
         
         System.out.println(((Route)route).isValid());
         
             
         
         
         File file = new File("cities.txt");
         FileWriter fw = new FileWriter(file, true);
         
         for (IAddress c: route.getPath()){
             String s="";
             if (c instanceof City){
                s = ((City)(c)).getName();
                s=s+";"+c.getLocation(); 
                s=s+";"+((City)c).getCountry()+"\n";
             }
             fw.write(s);
         }
         fw.close();
       
         
     }
}



