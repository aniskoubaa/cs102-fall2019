
package topic03.polymorphism.comparable;

import java.util.ArrayList;
import java.util.Collections;


public class Test {
    public static void main(String []args){
        
        
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(9);
        intList.add(7);
        intList.add(14);
        intList.add(5);
        intList.add(2);
        
        System.out.println(intList);
        
        Collections.sort(intList);
        
        System.out.println("sorted list: "+intList);
        System.out.println("min of list: "+Collections.min(intList));
        System.out.println("max of list: "+Collections.max(intList));
        
        
        Student s1= new Student("Mohamed", "Ali", 39);
        Student s2= new Student("Sami", "Kamel", 25);
        Student s3= new Student("Ahmed", "Salah", 53);
        
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        
        System.out.println("students: "+students);
        
        //Collections.sort(students);
        Collections.sort(students, new LastNameComparator());
        System.out.println("stored students: "+students);
        System.out.println("max students: "+Collections.max(students, new LastNameComparator()));
        System.out.println("min students: "+Collections.min(students, new LastNameComparator()));
        
    }  
}
