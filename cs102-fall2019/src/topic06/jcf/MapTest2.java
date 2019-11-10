/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class MapTest2 {
    
    public static void main(String []args){
        
        
        
        Map<String, Double> studentGradesMap = new TreeMap<String, Double>();
        
        studentGradesMap.put("ST125", 3.14);
        studentGradesMap.put("ST123", 3.67);
        studentGradesMap.put("ST124", 3.43);
        studentGradesMap.put("ST126", 3.67);
        

        System.out.println(studentGradesMap);
        
        
      /* studentGradesMap.remove("ST124");
       System.out.println(studentGradesMap);
       
       studentGradesMap.remove("ST125", 2.2);
       System.out.println(studentGradesMap);
       
       studentGradesMap.put("ST126", 3.98);
       studentGradesMap.remove("ST126", 3.98);
       System.out.println(studentGradesMap);
       
       */
      
      Set<String> keys = studentGradesMap.keySet();
      System.out.println(keys);
      
      for (String s : keys){
          System.out.printf("%s has a grade %.2f\n", s, studentGradesMap.get(s));
      }
      
      
      
        System.out.println("using an iterator");
      //using an iterator
      Iterator<String> it = keys.iterator();
      while (it.hasNext()){
          String s = it.next();
          System.out.printf("%s has a grade %.2f\n", s, studentGradesMap.get(s));
      }
       
        System.out.println(studentGradesMap.size());
        
        
        List<Double> list = new ArrayList<Double>(studentGradesMap.values());
        System.out.println(studentGradesMap.values());
        System.out.println(list.get(2));
       
    }
}
