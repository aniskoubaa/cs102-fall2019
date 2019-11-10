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


public class MapTest {
    
    public static void main(String []args){
        
        
        
        Map<String, Double> studentGradesMap = new TreeMap<String, Double>();
        
        studentGradesMap.put("ST123", 3.67);
        studentGradesMap.put("ST124", 3.43);
        studentGradesMap.put("ST125", 3.14);
        studentGradesMap.put("ST126", 3.67);
        
        List<String> courses1 = new ArrayList<String>();
        List<String> courses2 = new ArrayList<String>();
        
        courses1.add("CS101");
        courses1.add("CS102");
        courses1.add("CS105");
        
        courses2.add("CS101");
        courses2.add("CS102");
        
        System.out.println(courses1.containsAll(courses2));
        
        
        Iterator<String> it2 = courses1.iterator();
        
        while(it2.hasNext()){
            String s = it2.next();
            System.out.println(s);
        }
        
        System.out.println(studentGradesMap.size());
        
        System.out.println(studentGradesMap);
        
        studentGradesMap.remove("ST124");
        
        System.out.println(studentGradesMap);
        
        
        System.out.println(studentGradesMap.get("ST123"));
        
        //iteration
        
        Set<String> keySet = studentGradesMap.keySet();
        
        for (String s : studentGradesMap.keySet()){
            System.out.printf("%s %.2f\n", s, studentGradesMap.get(s));
        }
        
        System.out.println("------------------------------");
        //iterator 
        Iterator<String> it = studentGradesMap.keySet().iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.printf("%s %.2f\n", s, studentGradesMap.get(s));
        }
    
    }
}
