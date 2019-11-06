/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf;

import java.util.Comparator;

/**
 *
 * @author akoubaa
 */
public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getAge()-s2.getAge();
    }
    
}
