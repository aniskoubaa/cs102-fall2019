package topic04.genericclasses;


public class GenericMethod2 {
    
    public static <T extends Comparable<T>> T max (T x, T y, T z){
        
        T max = x;
        if (max.compareTo(y)<0) max = y;
        if (max.compareTo(z)<0) max = z;
        
        return max;
        
    }
    
    /*public static int max (int x, int y, int z){
        
        int max = x;
        if (max<y) max = y;
        if (max<z) max = z;
        
        return max;
        
    }
    
    public static double max (double x, double y, double z){
        
        double max = x;
        if (max<y) max = y;
        if (max<z) max = z;
        
        return max;
        
    }*/
    
    
    public static void main(String []args){
        
        
        System.out.println(max (2,16,9));
        System.out.println(max (2.9,16.2,-9.5));
        
        Person p1 = new Person ("Mohamed", 39);
        Person p2 = new Person ("Ali", 24);
        Person p3 = new Person ("Salah", 29);
        
        System.out.println(max(p1, p2, p3));
        
        
    }
    
}
