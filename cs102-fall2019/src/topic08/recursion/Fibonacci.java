
package topic08.recursion;


public class Fibonacci {
    
    /** series: 
     * xn=f(x(n-1));
     * xn = x(n-1) + x(n-2)
     * f(0)= 0
     * f(1)= 1
     * 
     * f(n)= f(n-1)+f(n-2)
     * f(2)= f(1)+f(0)=1+0=1
     * f(3)= f(2)+f(1)=1+1=2
     * 
     * fn2=f(2)
     * fn1=f(3)
     * 
     * f(4)=f(3)+f(2)=2+1=3
     * 
     * fn2=f(3)
     * fn1=f(4)
     * 
     * f(5)=f(4)+f(3)=3+2=5
     * fn2=f(4)
     * fn1=f(5)
     * 
     * 
     * 
     * 
   */
    
    //recursive function
    public static long rfib (long number){
        
        //base case
        //if (number ==0 ) return 0;
        //if (number == 1) return 1;
        if (number <=1) return number;
        //general case
        return rfib(number-1)+ rfib(number-2);
    }
    
    
    //iterative version 
    public static long fibonacci (long number){
        
        //base case
        if (number == 0 ) return 0;
        if (number == 1 ) return 1;
        
        long fn=0;
        long fn2=0; //f0
        long fn1=1; //f1
        
        
        for (int i=2;i<=number;i++){
            System.out.printf("f(%d)=f(%d)+f(%d)=%d\n",i,(i-1),(i-2),(fn1+fn2));
            fn = fn1+fn2;
            fn2=fn1;
            fn1=fn;        
            
        }
        
        return fn;
    }
    
    
    
    public static void main(String []args){
        
        int [] ints = {10};
        System.out.println("fibonacci");
        for (int v : ints){
            System.out.printf("fibonacci(%d) = %d\n", v, rfib(v));
        }
        
        
        
    }
    
    
}
