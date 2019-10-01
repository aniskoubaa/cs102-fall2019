/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensorclass;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author akoubaa
 */
public class SensorTest {
    
    ArrayList<Integer> intA = new ArrayList<Integer>(Arrays.asList(1,5,7,2,9));
    
    public  static ArrayList<DistanceSensor> distanceSensors=new ArrayList<>(
            Arrays.asList(new DistanceSensor(1.0,0.3,5.0,"D12345","Sharp","SD01"),
                    new DistanceSensor(3.0,0.1,10.0,"D12346","Sharp","SD02")));
    
    public static  ArrayList<GazSensor> gazSensors=new ArrayList<>(
            Arrays.asList(new GazSensor("MQ2",200,"ppm","G12345","Arduino","SG01"),
                    new GazSensor("MQ5",350,"ppm","G12346","Arduino","SG02")));
    
    
    
    public static boolean DangerAlarm(){
            for (int i = 0; i < distanceSensors.size(); i++) {
            if(distanceSensors.get(i).getRange()<1.0){
                return true;
                
            }}
            for (int j = 0; j < gazSensors.size(); j++) {
              if(gazSensors.get(j).getValue()>500){
                return true;
            }  
            }
            return false;
        }
    
    public static boolean randomize(ArrayList<DistanceSensor> ds,ArrayList<GazSensor> gazSensors){
        for (int i = 0; i < ds.size(); i++) {
            ds.get(i).setRange(Math.random());
        }
        for (int i = 0; i < gazSensors
                .size(); i++) {
             gazSensors.get(i).setValue(Math.random());
        }
        
        
             if(DangerAlarm()==true){
                 return true;
             }

             return false;
    }
    
}
