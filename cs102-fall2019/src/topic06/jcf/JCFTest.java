
package topic06.jcf;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class JCFTest {
    public static void main(String []args){
        
        
        List <String> arrayList = new ArrayList<String>();
        List <Integer> linkedList = new LinkedList<Integer>();
        
        Set <Integer> hashSet = new HashSet<Integer>();
        Set <Integer> treeSet = new TreeSet<Integer>();
        
        arrayList.add("Mohamed");
        arrayList.add("Salah");
        
        System.out.println("arrayList: "+ arrayList);
        System.out.println("the first element in arrayList: "+ arrayList.get(0));
        
        
        for (int i=0;i<5;i++){
          linkedList.add((int)(Math.random()*10));
        }
        
        System.out.println("linkedList: "+ linkedList);
        System.out.println("the second element in linkedList: "+ linkedList.get(1));
        
        for (int i=0;i<10;i++){
          hashSet.add((int)(Math.random()*7));
        }
        
        System.out.println("hashSet: "+ hashSet);
        
        System.out.println("index of Salah: "+ arrayList.indexOf("Salah"));
        
        
        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(hashSet);
        
        System.out.println("use a for loop to print an arrayList");
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        
        System.out.println("use a for loop to print a linkedList");
        for (int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }
        
        System.out.println("use a for loop to print a hashSet");
        /*for (int i=0;i<hashSet.size();i++){
            System.out.println(hashSet.get(i));
        }*/
        
        for (Integer n : hashSet){
            System.out.println(n);
        }
        
        
        
    }
    
    
}
