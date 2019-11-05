/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;


public class IteratorTest {
    
    public static void main(String []args){
        
        List <String> arrayList = new ArrayList<String>();
        List <Integer> linkedList = new LinkedList<Integer>();
        Set <Integer> hashSet = new HashSet<Integer>();
        Set <Integer> treeSet = new TreeSet<Integer>();
        
        arrayList.add("Mohamed");
        arrayList.add("Salah");
        arrayList.add("Ahmed");
        arrayList.add("Kalam");
        arrayList.add("Talal");
        arrayList.add("Samir");
        
        for (int i=0;i<5;i++){
          linkedList.add((int)(Math.random()*10));
        }
        
        
        for (int i=0;i<10;i++){
          hashSet.add((int)(Math.random()*7));
        }
        
        for (int i=0;i<10;i++){
          treeSet.add((int)(Math.random()*7));
        }
        
        
        System.out.println("using an iterator for ArrayList");
        Iterator<String> itArrayList = arrayList.iterator();
        while (itArrayList.hasNext()){
            String s = itArrayList.next();
            System.out.println(s);
            if (s.compareToIgnoreCase("salah")==0)
                itArrayList.remove();
        }
        
        System.out.println(arrayList);
        
        System.out.println("using an iterator for LinkedList");
        Iterator<Integer> itLinkedList = linkedList.iterator();
        while (itLinkedList.hasNext()){
            Integer n = itLinkedList.next();
            System.out.println(n);
        }
        
        
        System.out.println("using an iterator for HashSet");
        Iterator<Integer> itHashSet = hashSet.iterator();
        while (itHashSet.hasNext()){
            Integer n = itHashSet.next();
            System.out.println(n);
        }
        
        
        System.out.println("using a list iterator to print in backward direction");
        ListIterator <String> it2 = arrayList.listIterator(arrayList.size());
        while(it2.hasPrevious()){
            String s = it2.previous();
            System.out.println(s);
        }
        
        ListIterator <Integer> it3 = linkedList.listIterator();
        
        
    }
    
}
