/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorexam02.fall2019.core;

import java.util.Comparator;
import majorexam02.fall2019.interfaces.IAddress;


public class AddressComparator implements Comparator <IAddress>{

    @Override
    public int compare(IAddress A1, IAddress A2) {
        Double d1 = GPSDistanceCalculator.distance((GPS)A1.getLocation(), 
                new GPS(0,0,0), "K");
        Double d2 = GPSDistanceCalculator.distance((GPS)A2.getLocation(), 
                new GPS(0,0,0), "K");
        
        
        return d2.compareTo(d1);
    }
    
}
