/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorexam.fall2019.core;

import java.util.ArrayList;
import java.util.List;
import majorexam.fall2019.interfaces.ICity;
import majorexam.fall2019.interfaces.IRoute;
import majorexam.fall2019.interfaces.IRouteFacade;


public class RouteFacade implements IRouteFacade{

    @Override
    public IRoute buildRoute(List<ICity> cities) {
        
        Route route = new Route();
        for (ICity c : cities){
            if (c instanceof City)
                route.add((City)c);
        }
        
        return route;        
    }

    @Override
    public double routeLength(IRoute route) {
          return ((Route)route).getLength();
    }
    

    @Override
    public void printRoute(IRoute route) {
        System.out.println(route);
    }

    @Override
    public List<ICity> createCities(String country) {
        List<ICity> cities = new ArrayList<ICity>();
        if (country.equalsIgnoreCase("saudi arabia")){
            ICity jeddah = new City("Jeddah", new GPS(21.2854, 39.2376, 1.0), "Saudi Arabia");
             ICity makkah = new City("Makkah", new GPS(21.3891, 39.8579, 1.0), "Saudi Arabia");
             ICity madinah = new City("Madinah", new GPS(24.5247, 39.5692, 1.0),"Saudi Arabia");
             ICity riyadh = new City("Riyadh", new GPS(24.7136, 46.6753, 1.0),"Saudi Arabia");
            cities.add(jeddah);
            cities.add(riyadh);
            cities.add(madinah);
            cities.add(makkah);
        }
        
        return cities;
    }
    
}
