/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.major02.spring2018.core;

import exams.major02.spring2018.interfaces.Humidity;
import exams.major02.spring2018.interfaces.Temperature;

/**
 *
 * @author akoubaa
 */
public class HumiditySensor extends AirQualitySensor implements Humidity{

    public HumiditySensor(String unit, double value) {
        super(unit, value);
    }
    
    
    
    @Override
    public String toString() {
        return String.format("%.3f %s\n",getValue(),getUnit());
    }
}