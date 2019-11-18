
 
 public class Code3 
{

   public static void main(String[] args)
   {
      String atatement ="CS102 is a good course. i like the CS102 course. ";

      String[] words=atatement.split(" ");  
      int wrd=1;   
      
      for(int i=0;i<words.length;i++)     
      {
         for(int j=i+1;j<words.length;j++) 
         {
            
         if(words[i].equals(words[j]))  
            {
               wrd=wrd+1;    
               words[j]="0"; 
            }
         }
         if(!"0".equals(words[i]))
         System.out.println(words[i]+" = "+wrd); 
         wrd =1 ;        
        }  
          }
}
