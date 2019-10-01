/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensorclass;

import java.util.ArrayList;
import java.util.Arrays;


public class GazSensor extends AirQualitySensor{
    private  String gazType;
    private final ArrayList<String> types=new ArrayList<>(Arrays.asList("MQ2","MQ3","MQ5","MQ9"));
 
    public GazSensor(String gazType, double value, String unit, String id, String brand, String name) {
        super(value, unit, id, brand, name);
        setGazType(gazType);   
    }
 
    public String getGazType() {
        return gazType;
    }
 
    public void setGazType(String gazType) {
       if(types.contains(gazType)){
        this.gazType = gazType;
       }else throw new IllegalArgumentException("wrong type");
    }
    @Override
    public void setId(String id){
        if(id.length()==6&&id.startsWith("G") && id.split("G")[0].matches("[0-9]+") ){
            this.id=id;
        }else throw new IllegalArgumentException("wrong id!");
    }
 
    @Override
    public String toString() {
        return String.format("type : gaz, id : %s, brand : %s , name : %s, value:%.2f, unit: %s, gaz_type=%s",
                id, getBrand(), getName(), getValue(), getUnit(), getGazType());
    }
    
    
    
}
