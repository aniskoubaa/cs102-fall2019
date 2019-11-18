

import java.util.ArrayList;

public class Code1 {
    public static void main(String[] args) {
        String stat= "CS102 is a good course. I like the CS102 course. ";
        String[] words = stat.split(" ");
       ArrayList<String>  wo = new ArrayList<String>();   
      int i =0;
      System.out.printf("%s\t    %s\n","word","frequency");
       while(!(wo.contains(words[i]))){
          int counter = 0;
          String ss = words[i];
           for (int j = 0; j <words.length; j++) {
               String nf = words[j];
               if(ss.equals(nf)){
                   counter++;
               }
           }
           System.out.printf("%s\t\t%d\n",ss,counter);
           wo.add(words[i]);
           i++;
    }}
    
}
