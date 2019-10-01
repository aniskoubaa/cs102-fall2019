/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensorclass;

public class AirQualitySensor extends Sensor{
    private double value;
    private String unit;
 
    public AirQualitySensor(double value, String unit, String id, String brand, String name) {
        super(id, brand, name);
        setValue(value);
        setUnit(unit);
    }
 
    public AirQualitySensor(AirQualitySensor airQualitySensor) {
        this(airQualitySensor.value,airQualitySensor.unit,airQualitySensor.getId()
                ,airQualitySensor.getBrand(),airQualitySensor.getName());
    }
    
    @Override
    public void setId(String id){
        if(id.length()==6&&id.startsWith("A") && id.split("A")[0].matches("[0-9]+") ){
            super.setId(id);
        }else throw new IllegalArgumentException("wrong id!");
    }
    
 
    public double getValue() {
        return value;
    }
 
    public void setValue(double value) {
        this.value = value;
    }
 
    public String getUnit() {
        return unit;
    }
 
    public void setUnit(String unit) {
        this.unit = unit;
    }
 
    @Override
    public String toString() {
        return String.format("TYPE: air_quality,%s, value: %.2f, unit: %s", super.toString(),value,unit); 
    }
    
    
    
    
}
