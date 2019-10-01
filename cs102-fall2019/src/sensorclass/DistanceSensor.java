/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensorclass;

public class DistanceSensor extends Sensor{
    private double range;
    private final double MIN_RANGE,MAX_RANGE;
 
    public DistanceSensor(double range, double Min_RANGE, double MAX_RANGE, String id, String brand, String name) {
        super(id, brand, name);
        setRange(range);
        this.MIN_RANGE = Min_RANGE;
        this.MAX_RANGE = MAX_RANGE;
    }
 
    public DistanceSensor(DistanceSensor distanceSensor) {
        this(distanceSensor.range,distanceSensor.MIN_RANGE,distanceSensor.MAX_RANGE
                ,distanceSensor.getId(),distanceSensor.getBrand(),distanceSensor.getName());
    }
    @Override
    public void setId(String id){
        if(id.length()==6&&id.startsWith("D") && id.split("D")[0].matches("[0-9]+") ){
            super.setId(id);
        }else throw new IllegalArgumentException("wrong id!");
    }
 
    public double getRange() {
        return range;
    }
 
    public void setRange(double range) {
        if (range>=MIN_RANGE && range<=MAX_RANGE) {
          this.range = range;  
        }else throw new IllegalArgumentException("wrong range!");
        
    }
 
    @Override
    public String toString() {
        return String.format("Type: distance,%s, range: %.2f, min_range: %.2f, "
                + "max_range: %.2f",super.toString(),range,MIN_RANGE,MAX_RANGE );
    }
    
    
}
