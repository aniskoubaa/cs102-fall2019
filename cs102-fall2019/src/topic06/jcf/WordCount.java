package topic06.jcf;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class WordCount {

    public static void main(String []args){
        
        
        String statement = "CS102 is a good course. I like the CS102 course.";
        
        statement = statement.replaceAll("[^a-zA-Z0-9\\s]", "");
        
        System.out.println(statement);
        String [] words = statement.split(" ");
        
        Map<String, Integer> wordMap = new HashMap<String, Integer>();
        
        //make a program that counts how many words appear in this sentence
        
        /*
        CS102 -> 2
        is -> 1
        a -> 1
        good -> 1
        course -> 2
        */
        
        
        for (String w : words){
            
            if (!wordMap.containsKey(w)){
                wordMap.put(w, 1);
                //System.out.printf("%s %d\n", w, wordMap.get(w));
            }else{
                //int currentCount = wordMap.get(w);
                //int newCount = currentCount + 1;
                //wordMap.put(w, newCount);  
                wordMap.put(w, wordMap.get(w)+1);
                //System.out.printf("%s %d\n", w, wordMap.get(w));
            }
        }
        
        System.out.println(wordMap);
        
        
        Set<String> keys = wordMap.keySet();
        
        
       
        
        System.out.printf("|%-15s|%-10s|\n", "word", "count");
        System.out.printf("|--------------------------|\n");
        for (String s : keys){
            System.out.printf("|%-15s|%-10d|\n", s, wordMap.get(s));
        }
        
    }
    
}
