package topic04.generics;


public class GenericMethods2 {
    
    
    public static <T extends Comparable<T>> T max(T x, T y, T z){
        T max = x;
        if (max.compareTo(y)<0) max = y;
        if (max.compareTo(z)<0) max = z;
        
        return max;
        
    }
    
    
    
    
    public static void main(String []args){
        
        
        System.out.println(max(3,6,4));
        
        System.out.println(max(3.9,6.4,10.4));
        
        
        
        
        
        
    }
    
}
