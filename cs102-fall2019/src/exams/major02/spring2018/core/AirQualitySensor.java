package exams.major02.spring2018.core;

public class AirQualitySensor extends SensorImpl{
    
    
    public double alertThreshold = 200;

    public AirQualitySensor(String unit, double value) {
        super(unit, value);
    }

    public AirQualitySensor(SensorImpl s) {
        super(s);
    }

    

     
    
}

