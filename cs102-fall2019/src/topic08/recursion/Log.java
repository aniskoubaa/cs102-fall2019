/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic08.recursion;

public class Log {
    
    
    /*
    To sove the question of approximating ln(1+x) we use Taylor series
    ln (1 + x) = x − x ^2/ 2 + x^3/3 − x^4/ 4 + x^5 /5 − . . .
    for -1<x<1
    where ln is log10
    */
    
    
    public static double rLog2(double x, int n){
        
        int sign = 1; //the sign is positive (+1) is n is odd and negative (-1) if n is even
        /** first make sure that x is in [-1,1] **/
        if ((x<=-1)||(x>=1))
            throw new IllegalArgumentException("x must be in [1, 1]");
        /* 
        first we start with the base case
        according to the equation is n==1, ln(1+x) = x;
        */
        if(n==1) //we do not have a case for n=0. The initial point is with n=1 for the equation.
            return x; //this is the case case
        else {
            if ((n%2) == 0) {sign=-1;} //if n is even, make the sign negative
            //System.out.println(sign);
            return rLog2(x,n-1) + (sign*(Math.pow(x, n)/n));
        }
    }
    
    public static void main(String []args){
        
        
        for (double x=-0.9; x<1.0 ;x=x+0.2){ //you can use a while loop
            System.out.printf("ln(1+%.2f, %d) = %.15f, error = %.10f\n", 
                    x, 10, rLog2(x,10), (Math.log(1+x)-rLog2(x,10)));
            
            System.out.printf("ln(1+%.2f, %d) = %.15f, error = %.10f\n", 
                    x, 100, rLog2(x,100), (Math.log(1+x)-rLog2(x,100)));
            
            System.out.printf("Math.log10(1+%.2f) = %.15f\n", x, Math.log(1+x));
            System.out.println("");
        }
        
    }
    
}
