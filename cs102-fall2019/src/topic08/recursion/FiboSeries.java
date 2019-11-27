
package topic08.recursion;

import static topic08.recursion.Fibonacci.rfib;


public class FiboSeries {
    
    //f(0)=0  //BASE CASE
    //f(1)=1  //BASE CASE
    //f(2)=f(0)+f(1)=0+1=1
    //f(3)=f(1)+f(2)=1+1=2
    //f(4)=f(2)+f(3)=1+2=3
    //f(n)=f(n-2)+f(n-1)  GENERAL CASE
    
    
    public static long recursive_fibonacci (long n){
        //base case
        if (n==0) return 0;
        if (n==1) return 1;
        
        return recursive_fibonacci(n-2)+recursive_fibonacci(n-1);
        
    }
    
    
    //iterative version 
    public static long iterative_fibonacci (long number){
        
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
            System.out.printf("iterative_fibonacci(%d) = %d\n", v, iterative_fibonacci(v));
            System.out.printf("recursive_fibonacci(%d) = %d\n", v, recursive_fibonacci(v));
        }
        
        
        
    }
    
    
    
}
