/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.major02.spring2018.core;

import exams.major02.spring2018.interfaces.Pressure;




public class PressureSensor extends AirQualitySensor implements Pressure{
    
    public PressureSensor(String unit, double value) {
        super(unit, value);
    }
    

}
