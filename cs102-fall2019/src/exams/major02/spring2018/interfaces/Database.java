/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.major02.spring2018.interfaces;

import java.util.Map;
import java.util.Set;


public interface Database <T>{
    
    //get the name of the database
    public abstract String getName();
    //add a new element in the database
    public abstract void storeElement(T t);
    //update an existing element in the database
    public abstract void updateElement(T t);
    //remove the element t from the database
    public abstract void removeElement(T t);
    //return the database that is defined a Map<String,T>
    public abstract Set<T> getDB();
    
}
