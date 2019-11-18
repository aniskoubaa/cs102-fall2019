/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.major02.spring2018.interfaces;


/**
 *
 * @author akoubaa
 */
public interface Measurable extends Comparable <Measurable>{
    public abstract double value();
    public abstract String unit();
    
}
