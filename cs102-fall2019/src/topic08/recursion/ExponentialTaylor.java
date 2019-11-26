
package topic08.recursion;


public class ExponentialTaylor {
    
    
    /*
    f(x,0) = 1 //BASE CASE 
    f(x,1) = f(x,0) + x = 1 + x
    f(x,2) = 1 + x + (x2/2!) = f(x,1) + (x^2/2!)
    f(x,3) = 1 + x + (x2/2!) + (x3/3!) = f(x,2) + (x^3/3!)
    
    f(x,n) = f(x, n-1) + (x^n/n!) //GENERAL CASE
    
    */
    
    
    public static double eTwo(double x, int n){
        if(n==0)
            return 1; //BASE CASE
        else {
            //System.out.println(eTwo(x,n-1));
            return eTwo(x,n-1) + Math.pow(x, n)/factorial(n);
        }
    }
    
    
    
    
    
    public static double eTwo1(double x, int n){
        if(n==0)
            return Math.E;
        else {
            //System.out.println(eTwo(x,n-1));
            return eTwo(x,n-1) + ((Math.E*Math.pow(x-1, n))/factorial(n));
        }
    }
    
    public static double Exp(double x , int n, int a){
        
        double C = Math.pow(Math.E, a);
        if (n==0)
            return C;
        else 
        return eTwo(x,n-1) + ((C*Math.pow(x-a, n))/factorial(n));
    }

    public static double factorial (int n){
        if(n==0)
            return 1;
        else 
            return n*factorial(n-1);
    }
    
    public static void main(String []args){
        
        
        for (int i=1;i<5;i++){
            int a = 1;
            //System.out.println("eTwo("+i+",10): "+eTwo(i,10)+" error= "+(Math.exp(i)-eTwo(i,10)));
            //System.out.println("eTwo1("+i+",20): "+eTwo1(i,20)+" error= "+(Math.exp(i)-eTwo(i,20)));
            //System.out.println("Math.exp("+i+"): "+Math.exp(i));
            System.out.printf("E(%d, %d) = %.15f, error = %.10f\n", 
                    i, 10, eTwo1(i,10), (Math.exp(i)-eTwo(i,10)));
            System.out.printf("E(%d, %d) = %.15f, error = %.10f\n", 
                    i, 20, eTwo1(i,20), (Math.exp(i)-eTwo(i,20)));
            System.out.printf("Exp(%d, %d, %d) = %.15f, error = %.10f\n", 
                    i, 20, a, Exp(i,20,4), (Math.exp(i)-eTwo(i,20)));
            System.out.printf("Math.exp(%d) = %.15f\n", 
                    i, Math.exp(i));
            System.out.println("");
        }
        
    }

    
}
