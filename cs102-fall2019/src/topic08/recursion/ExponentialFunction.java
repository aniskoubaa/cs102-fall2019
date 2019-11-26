package topic08.recursion;

public class ExponentialFunction {
    //BASE CASE 
    //f0= x^0/0! = 1
    //f1= x^0/0!+ x^1/1! = f0 + x^1/1!
    //f2= x^0/0!+ x^1/1!+x^2/2! = f1+x^2/2!
    //f3 = f2 + x^3/3!
    //GENERAL CASE
    //fn=f(n-1)+x^n/n!
    
    
    public static long factorial(long number){
        //base case
        if (number == 0) return 1;
        if (number == 1) {
            //System.out.printf("fact(1)=1 is known. rolling back.\n");   
            return 1;
         }
        //System.out.printf("fact(%d) = fact(%d)*%d. fact(%d) is not known\n", number, (number-1), number, (number-1));
        
        return number*factorial(number-1);
        
    }
    
    
    public static double exponential (double x, int n){
        
        //base case
        if (n==0) return 1;       
        
        //general case
        return exponential(x,n-1)+Math.pow(x, n)/factorial(n);
        
    }
    
    
  
    
    
    public static void main(String []args){
        double x=3.2;
        int n = 20;
        double ApproximateEx = exponential(x,n);
        double ExactEx = Math.exp(x);
         System.out.println("Exact Exp Value is: "+ ExactEx);
        System.out.println("Approximate Exp Value is: "+ ApproximateEx);
        System.out.println("Error between Exact and Approximate: "+ (ExactEx-ApproximateEx));
    }
    
    
}
