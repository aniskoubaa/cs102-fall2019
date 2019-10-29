package topic04.genericclasses;


public class GenericMethods {
    
    public static <T> void printArray(T [] A){
        for (int i=0;i<A.length;i++){
            System.out.printf("A[%d]=%s\n", i, A[i]);
        }
    }
    
    /*public static void printArray(int [] A){
        for (int i=0;i<A.length;i++){
            System.out.printf("A[%d]=%d\n", i, A[i]);
        }
    }
    
    public static void printArray(double [] A){
        for (int i=0;i<A.length;i++){
            System.out.printf("A[%d]=%d\n", i, A[i]);
        }
    }
    
    public static void printArray(char [] A){
        for (int i=0;i<A.length;i++){
            System.out.printf("A[%d]=%d\n", i, A[i]);
        }
    }
    */
    
    public static void main(String []args){
        
        
        Integer [] intArray = {3,6,8,1,5,7};
        Double [] doubleArray = {3.0,6.4,8.1,1.7,-5.0,7.99};
        Character [] charArray = {'a','y','h'};
        
        
        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);
        
        
    }
    
}
