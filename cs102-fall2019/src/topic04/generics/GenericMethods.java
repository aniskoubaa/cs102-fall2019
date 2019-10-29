package topic04.generics;

public class GenericMethods {
    
    
    
    
    //define generic T
    
    /*public static void printArray(int [] array){
         
         for (int i=0;i<array.length;i++){
             System.out.print(array[i]+"  ");
         }
         System.out.println("");         
     }
    
    public static void printArray(double [] array){
         
         for (int i=0;i<array.length;i++){
             System.out.print(array[i]+"  ");
         }
         System.out.println("");         
     }
    
    public static void printArray(char [] array){
         
         for (int i=0;i<array.length;i++){
             System.out.print(array[i]+"  ");
         }
         System.out.println("");         
     }*/
    
    //I need to define a general type
    public static <T> void printArray(T [] array){
         
         for (int i=0;i<array.length;i++){
             System.out.print(array[i]+"  ");
         }
         System.out.println("");         
     }
     
    
    public static void main(String []args){
        
        
        
        Integer [] intArray = {1,4,6,7,9};
        Double [] doubleArray = {1.5,4.33,6.67,9.7,8.9};
        Character [] charArray ={'a', 'f', 'b'};
        String [] stringArray = {"ONE", "TWO", "THREE", "FOUR"};
        
        
        
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);

    }
    
}
