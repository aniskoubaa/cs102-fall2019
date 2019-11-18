package exams.major02.spring2018.core;

import exams.major02.spring2018.interfaces.Distance;
import exams.major02.spring2018.interfaces.Sensor;



public class DistanceSensor extends SensorImpl implements Sensor, Distance{
    
    private double range;
    
    private final double MIN_RANGE;
    private final double MAX_RANGE;

    public double alertThreshold = 1.0;

    public DistanceSensor(String unit, double value) {
        super(unit, value);
        MIN_RANGE=0.0;
        MAX_RANGE=10.0;
    }
    
    
    
    
    @Override
    public String unit() {
        return "m";
    }

    

    

    public double getMinRange() {
        return MIN_RANGE;
    }

    public double getMaxRange() {
        return MAX_RANGE;
    }
    
    
    
    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        if(range>=MIN_RANGE&&range<=MAX_RANGE)
            this.range = range;
        else throw new IllegalArgumentException("wrong range");
    }
    
    

    @Override
    public String toString() {
        return String.format("%.3f %s\n",getValue(),getUnit());
    }

    
    
    
}

