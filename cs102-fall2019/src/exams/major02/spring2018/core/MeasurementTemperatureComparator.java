package exams.major02.spring2018.core;

import exams.major02.spring2018.interfaces.Measurement;
import exams.major02.spring2018.interfaces.Sensor;
import exams.major02.spring2018.interfaces.Temperature;
import java.util.Comparator;


/*** Task 3 MeasurementTemperatureComparator   ***/

public class MeasurementTemperatureComparator implements Comparator<Measurement>{

    @Override
    public int compare(Measurement m1, Measurement m2) {
        
        Double t1=0.0;
        //extract temperature value of m1
        for (Sensor s : m1.getSensors()){
            if (s instanceof Temperature)
              t1=s.getValue();
        }
        
        Double t2=0.0;
        //extract temperature value of m1
        for (Sensor s : m2.getSensors()){
            if (s instanceof Temperature)
              t2=s.getValue();
        }
        
        //compare between the two temperature values
        
        return t1.compareTo(t2);
        
        /*if (t1>t2)
            return 1;
        else if (t1<t2)
            return -1;
        else return 0;*/
        
        
    }
    
 
}
    
