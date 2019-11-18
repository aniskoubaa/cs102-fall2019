package exams.major02.spring2018.core;

import exams.major02.spring2018.interfaces.Sensor;
import exams.major02.spring2018.interfaces.Measurable;

public  class SensorImpl implements Sensor{
    private String unit;
    private double value;

    public SensorImpl(String unit, double value) {
        setUnit(unit); 
        setValue(value);
    }
    
    public SensorImpl(SensorImpl s){
        this(s.unit, s.value);
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
        return String.format("%.3f %s\n",getValue(),getUnit());
    }

    @Override
    public double value() {
       return value;
    }


    @Override
    public int compareTo(Measurable m) {
        if (this.value()<m.value())
            return -1;
        if (this.value()>m.value())
            return 1;
        return 0;
    }

    @Override
    public String unit() {
        return getUnit();
    }
    

    

    
    
}

