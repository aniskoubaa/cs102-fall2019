package topic08.recursion;


public class Exercise01 {
 
    //f1 = x^0 = 1 //BASE CASE
    //f2= f1 + 2*x^1 = f1 + 2x
    //f3 = f2 + 3 * x^2
    //fn = fn-1 + n*x^(n-1) //GENERAL CASE
    
    
    public static double f (double x, int n){
        
        if (Math.abs(x)>=1)
            throw new IllegalArgumentException("abs(x) must be smaller than 1");
        
        //base case
        if (n==1) return 1;
        //general case
        return f(x, n-1) + (n * Math.pow(x, n-1));
        
    }
    
    //f0 = 1
    //f1 = f0+ (-1)*x^2/2!
    //fn = fn-1 + (-1)^n * x^2n / (2n)!
    
    public static long rfact(long number){
        //BASE CASE
        if (number == 0) return 1;
        if (number == 1) {
            //System.out.println("fact(1)=1 is known. rolling back ");
            return 1;
        }
        //GENERAL CASE
        //System.out.printf("fact(%d) = fact(%d)*%d is NOT known\n", number, number-1, number);
        return rfact(number-1)*number;
    }
    
    
    public static double r_cos(double x, int n){
        
        //base case
        if (n == 0 ) return 1;
        
        //general case
        return r_cos(x, n-1) + (Math.pow(-1, n)*Math.pow(x, 2*n)/rfact(2*n));
        
    }
    
    
    //fn = fn-1 + x^(2n-1)/(2n-1)
    public static double r_itanh(double x, int n){
        
        //base case
        if (n == 1 ) return x;
        
        //general case
        return r_itanh(x, n-1)+ (Math.pow(x, 2*n-1)/(2*n-1));
        
    }
    
    public static void main(String []args){
        
        
        double x = Math.PI;
        
        System.out.printf("cos(%.2f) = %.2f\n", x, Math.cos(x));
        
        int n = 10;
        
        System.out.printf("r_cos(%.2f, %d) = %.2f\n", x,n, r_cos(x,n));
        
        System.out.printf("error = %.8f\n", Math.abs(r_cos(x,n)-Math.cos(x)));
        
        

        x=0.1;
        System.out.printf("r_itanh(%.5f, %d) = %.5f\n", x,n, r_itanh(x,n));
        
       
        
    }
    
    
}
