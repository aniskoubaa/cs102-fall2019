/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensorclass;

public class Sensor {
   private String brand,name; 
   protected String id;
 
    public Sensor(String id, String brand, String name) {
        setId(id);
        setBrand(brand);
        setName(name);
    }
 
    public Sensor(Sensor sensor) {
        this(sensor.id,sensor.brand,sensor.name);
    }
    
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public String getBrand() {
        return brand;
    }
 
    public void setBrand(String brand) {
        this.brand = brand;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    @Override
    public String toString() {
        return String.format("id : %s, brand: %s, name: %s",id,brand,name );
    }
   
}
