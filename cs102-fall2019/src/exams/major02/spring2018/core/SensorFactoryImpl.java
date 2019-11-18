package exams.major02.spring2018.core;

import exams.major02.spring2018.interfaces.Sensor;
import exams.major02.spring2018.interfaces.SensorFactory;


public class SensorFactoryImpl implements SensorFactory{

    @Override
    public Sensor getSensor(String sensorType, String unit, double value) {
        if (sensorType.equalsIgnoreCase("distance")){
            return new DistanceSensor(unit,value);
        }else if (sensorType.equalsIgnoreCase("humidity")){
            return new HumiditySensor(unit,value);
        }else if (sensorType.equalsIgnoreCase("pressure")){
            return new PressureSensor(unit,value);
        } else if (sensorType.equalsIgnoreCase("temperature")){
            return new TemperatureSensor(unit,value);
        } 
        return null;
    }
   
}

