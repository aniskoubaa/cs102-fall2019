package exams.major02.spring2018.core;

import exams.major02.spring2018.interfaces.GPS;
import exams.major02.spring2018.interfaces.Measurement;
import exams.major02.spring2018.interfaces.Sensor;
import java.util.HashSet;
import java.util.Set;

public class MeasurementImpl implements Measurement{
    
    private Date date;
    private Set<Sensor> sensors = new HashSet<Sensor>();
    private String cityName;
    private GPS gps;

    public MeasurementImpl(Date date, String cityName, GPS gps, Set<Sensor> sensors) {
        this.date = date;
        this.cityName = cityName;
        this.gps = gps;
        this.sensors = sensors;
    }

    
    

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(Set<Sensor> sensors) {
        this.sensors = sensors;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public GPS getGps() {
        return gps;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "{" + "date=" + date + ", sensors=" + sensors + ", cityName=" + cityName + ", gps=" + gps + '}';
    }

    
    
    
    
    
}
