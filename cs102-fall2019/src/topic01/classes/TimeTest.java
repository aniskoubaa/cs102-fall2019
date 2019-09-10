/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic01.classes;

/**
 *
 * @author akoubaa
 */
public class TimeTest {
    
    public static void main(String []args){
        
        
        Time t1 = new Time(1,20,56);
        
        System.out.println("t1: "+ t1.toUniversalString());
        System.out.println("t1: "+ t1.toStandardString());
        
        Time t2 = new Time(1,23);
        System.out.println("t2: "+ t2.toStandardString());
        
        Time t3=new Time();
        System.out.println("t3: "+ t3.toStandardString());
        System.out.println("t3: "+ t3.toUniversalString());
        
        Time t4 = new Time(t2);//copy constructor
        System.out.println("t4: "+ t4.toStandardString());
        
        System.out.println("t1: "+ t1.toString());
        System.out.println("t2: "+ t2);
        System.out.println("t3: "+ t3);
        System.out.println("t4: "+ t4);
        
    }
    
}
