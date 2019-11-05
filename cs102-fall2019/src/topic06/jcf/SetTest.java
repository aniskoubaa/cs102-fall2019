/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author akoubaa
 */
public class SetTest {
    
    public static void main(String []args){
        
        
        Set <Student> studentHashSet = new HashSet<Student>();
        Set <Student> studentTreeSet = new TreeSet<Student>();
        
        studentHashSet.add(new Student("Mounir", "Salah"));
        studentHashSet.add(new Student("Mohamed", "Ali"));
        
        
        System.out.println("studentHashSet: "+ studentHashSet);

        studentTreeSet.add(new Student("Mounir", "Salah"));
        studentTreeSet.add(new Student("Mohamed", "Ali"));
        
        
        System.out.println("studentTreeSet: "+ studentTreeSet);
        
    }
    
}
