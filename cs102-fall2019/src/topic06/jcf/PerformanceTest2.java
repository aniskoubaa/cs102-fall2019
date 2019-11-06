package topic06.jcf;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

 
public class PerformanceTest2 {
    
    public static void main (String [] args){
        
        List <String> arrayList = new ArrayList <String>();
        List <String> linkedList = new LinkedList <String>();
        
        int numberOfElement=90000;
     
        /* adding an element at the end of the list */
        //case of adding in ArrayList
        System.out.println("adding an element at the end of the list");
        long t0= System.currentTimeMillis();
        for (int i=0; i<numberOfElement; i++){
            arrayList.add("x="+i);
        }
        long t1=System.currentTimeMillis();
        System.out.println("duration ArrayList Add: "+ (t1-t0));
                
        //case of adding in LinkedList
        t0= System.currentTimeMillis();
        for (int i=0; i<numberOfElement; i++){
            linkedList.add("x="+i);
        }
        t1=System.currentTimeMillis();
        System.out.println("duration LinkedList Add: "+ (t1-t0));
        
        
        
        
        
        /********** using List Iterator ***************/
        
        System.out.println("using List Iterator");
    System.out.println(" ");
    t0= System.currentTimeMillis();

    ListIterator <String> arrayIterator = arrayList.listIterator();
    while (arrayIterator.hasNext()){
        String st = arrayIterator.next();
         //arrayIterator.set(st+".");
     }
    t1=System.currentTimeMillis();
    System.out.println("duration ArrayList Iterator: "+ (t1-t0));

    t0= System.currentTimeMillis();
    ListIterator <String> linkedIterator = linkedList.listIterator();

    while (linkedIterator.hasNext()){
        String st = linkedIterator.next();
        //linkedIterator.set(st+".");
     }
    t1=System.currentTimeMillis();
    System.out.println("duration LinkedList Iterator: "+ (t1-t0));
        
    
    }    
}
