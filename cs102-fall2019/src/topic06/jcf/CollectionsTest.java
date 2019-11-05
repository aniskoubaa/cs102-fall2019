package topic06.jcf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;


public class CollectionsTest {
    
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
        //System.out.println("the second element in linkedList: "+ hashSet.get(1));
        
        for (int i=0;i<10;i++){
          treeSet.add((int)(Math.random()*7));
        }
        
        System.out.println("treeSet: "+ treeSet);
        
        Set <Student> studentHashSet = new HashSet<Student>();
        Set <Student> studentTreeSet = new TreeSet<Student>();
        
        
        studentHashSet.add(new Student("Mounir", "Salah"));
        studentHashSet.add(new Student("Mohamed", "Ali"));
        
        
        System.out.println("studentHashSet: "+ studentHashSet);

        studentTreeSet.add(new Student("Mounir", "Salah"));
        studentTreeSet.add(new Student("Mohamed", "Ali"));
        
        
        System.out.println("studentTreeSet: "+ studentTreeSet);
        
        
        
        Iterator<String> it1 = arrayList.iterator();
        
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        
        Iterator<Student> it2 = studentHashSet.iterator();
        
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        
        
        
        ListIterator it3 = arrayList.listIterator(arrayList.size());
        while(it3.hasPrevious()){
            System.out.println(it3.previous());
        }
        
        
        
        
    }
    
    
}
