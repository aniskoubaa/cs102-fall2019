
package topic08.recursion;


public class RecursionTest {
    
    public static void anyFunction(){
        System.out.println("Hello");
        anyFunction();
    }
    
    
    public static void main (String []args){
        
        anyFunction();
        
    }
    
}
