/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realestate.impl;

import realestate.interfaces.IApartment;
import realestate.interfaces.IHome;
import realestate.interfaces.IRealEstate;
import realestate.interfaces.IRealEstateFactory;
import realestate.interfaces.ITerrain;

/**
 Create the class RealEstateFactory that implements the interface IRealEstateFactory.

The method in the class should create three types of objects:

If realEstateType = “home”, it returns an IHome object. 
* The number of rooms is set to 0 by default, and hasGarage is set to false by default.

If realEstateType = “terrain”, it returns an ITerrain object.
* The default value of hasSink is false.

If realEstateType = “apartment”, it returns an IApartment. 
* The number of rooms, number and floor number are set to 0 by default.


 */
public class RealEstateFactory implements IRealEstateFactory{

    @Override
    public IRealEstate getRealEstate(String realEstateType, String id, String name, double surface) {
        
        if (realEstateType.equalsIgnoreCase("home")){
            IHome home = new Home(id, name, surface, 0, false);
            return home;
            
        }else if (realEstateType.equalsIgnoreCase("terrain")){
            ITerrain terrain = new Terrain(id, name, surface, false);
            return terrain;
            
        }else if (realEstateType.equalsIgnoreCase("apartment")){
            IApartment apartment = new Apartment(id, name, surface, 0,0,0);
            return apartment;
        }
        return null;
    }
    
}
