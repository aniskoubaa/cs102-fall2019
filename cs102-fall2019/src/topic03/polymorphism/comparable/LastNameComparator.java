/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic03.polymorphism.comparable;

import java.util.Comparator;


public class LastNameComparator implements Comparator<Student>{
    @Override
    public int compare(Student st1, Student st2) {
        return st1.getLastName().compareTo(st2.getLastName());
    }
}
