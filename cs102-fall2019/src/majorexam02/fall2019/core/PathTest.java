/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorexam02.fall2019.core;

import java.util.ArrayList;
import java.util.List;
import majorexam02.fall2019.interfaces.ICity;
import majorexam02.fall2019.interfaces.IRoute;


public class PathTest {
    
    public static void main(String []args){
        
        
        
        //----------------------------------------------
        RouteFacade rf = new RouteFacade();
        
        List<ICity> cities = rf.createCities("saudi arabia");
        
        IRoute myRoute = rf.buildRoute(cities);
        
        System.out.println(rf.routeLength(myRoute));
        
        rf.printRoute(myRoute);
        
    }
    
}
