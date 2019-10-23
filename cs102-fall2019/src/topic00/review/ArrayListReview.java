
package topic00.review;

import java.util.ArrayList;
import java.util.TreeSet;


public class ArrayListReview {
    
    public static void main(String []args){
        
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        
        
        System.out.println("size of intArrayList: "+ intArrayList.size());
        intArrayList.add(4);
        System.out.println("size of intArrayList: "+ intArrayList.size());
        intArrayList.remove(0);
        System.out.println("size of intArrayList: "+ intArrayList.size());
        
        int x = 5;
        Integer a = 4;
        
        a=x;
        x=a;
        
        ArrayList<Double> doubleArrayList=new ArrayList<Double>();
        
        doubleArrayList.add(2.3);
        doubleArrayList.add(5.4);
        doubleArrayList.add(8.4);
        doubleArrayList.add(9.1);
       
        System.out.println("size of doubleArraList: "+ doubleArrayList.size());
        
        for (int i=0;i<doubleArrayList.size();i++){
            System.out.println(doubleArrayList.get(i));
        }
        
        //for each statement
        for (double y : doubleArrayList){
            System.out.println(y);
        }
        
        
        System.out.println("doubleArraList: "+ doubleArrayList);
        
        doubleArrayList.remove(2);
        
        System.out.println("doubleArraList: "+ doubleArrayList);
          
        ArrayList<String> stringArrayList;
        
        
        intArrayList.add(3);
        intArrayList.add(2);
        intArrayList.add(1);
        intArrayList.add(9);
        System.out.println("intArrayList: "+ intArrayList);
        intArrayList.remove((Integer)1);
        System.out.println("intArrayList: "+ intArrayList);
        
        intArrayList.add(0, 14);
        
        System.out.println("intArrayList: "+ intArrayList);
        
        intArrayList.addAll(intArrayList);
        System.out.println("intArrayList: "+ intArrayList);
        
        System.out.println(intArrayList.indexOf(9));
        Object [] intArray = intArrayList.toArray();
        
        TreeSet<Integer> intSet = new TreeSet<Integer>();
        System.out.println("intSet: "+ intSet);
        intSet.addAll(intArrayList);
        System.out.println("intSet: "+ intSet);
        intSet.add(9);
        System.out.println("intSet: "+ intSet);
    }
    
}
