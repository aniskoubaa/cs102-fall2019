
package exams.major02.spring2018.interfaces;


public interface SensorFactory {
    
    public abstract Sensor getSensor(String sensorType,String unit, double value);
    
}
