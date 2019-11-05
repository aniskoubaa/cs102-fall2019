package topic06.jcf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class WordMap {
    
    public static void main(String []args){
        
        Map<String, Integer> wordCountMap = new TreeMap<String, Integer>();
        
        String s = "CS102 is a great course I Like the course of CS102";
        String [] words = s.split(" ");
        
        for (int i=0;i<words.length;i++){
            String key = words[i];
            //if the word is NOT in the  map
            if (!wordCountMap.containsKey(key))
            //add the word and count = 1
                wordCountMap.put(key, 1);
            //if the word is in the map
            else{
            //get the value of the current count
            int count = wordCountMap.get(key);
            //increment the count 
            count = count + 1;
            //add the word and its new count to the map
            wordCountMap.put(key, count);
            
            }
        }
        
        /*Set<String> keys = wordCountMap.keySet();
        
        for (String k : keys){
            System.out.printf("%s => %d \n", k, wordCountMap.get(k));
        }*/
        
        Set<String> keys = wordCountMap.keySet();
        Iterator<String> it = keys.iterator();
        
        while(it.hasNext()){
            String w = it.next();//return the current value and then jumps to the next one
            System.out.printf("%s => %d \n", w, wordCountMap.get(w));
            
        }
        
        Set<String> newSet=new TreeSet<String>();
        newSet.add("CS101");
        newSet.add("test");
        Iterator<String> it2 = newSet.iterator();
        while (it2.hasNext()){
            String w = it2.next();
            wordCountMap.put(w, 1);
        }
        
        
        System.out.println(wordCountMap);
        
    }
    
}
