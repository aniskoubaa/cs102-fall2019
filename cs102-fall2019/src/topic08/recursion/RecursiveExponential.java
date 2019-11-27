package topic08.recursion;

import static topic08.recursion.ExponentialTaylor.Exp;
import static topic08.recursion.ExponentialTaylor.eTwo;
import static topic08.recursion.ExponentialTaylor.eTwo1;


public class RecursiveExponential {
    
    
    //base case
    //n = 0 => f(x,n) = 1
    //n = 1 => f(x,1) = 1 + x^1/1! = f(x,0) + x^1/1! 
    //n = 2 => f(x,2) = 1 + x^1/1! + x^2/2! = f(x,1) + + x^2/2!
    //n = 3 => f(x,3) = 1 + x^1/1! + x^2/2! + x^3/3! = f(x,2) + x^3/3!
    //GENERAL CASE
    //f(x,n) = f(x,n-1) + x^n/n!
    
    
    public static double recursive_exponential(double x, int n){
        
        //base case
        if (n == 0) return 1;
        
        return recursive_exponential(x,n-1)+ Math.pow(x, n)/factoriel(n);        
        
    }
    
    
    public static long factoriel(long number){
        //BASE CASE
        if (number == 0) return 1;
        if (number == 1) {
            System.out.println("fact(1)=1 is known. rolling back ");
            return 1;
        }
        //GENERAL CASE
        System.out.printf("fact(%d) = fact(%d)*%d is NOT known\n", number, number-1, number);
        return factoriel(number-1)*number;
    }
    
    
    
    
    public static void main(String []args){
        
        double x= 2.1;
        double real_exp_value = Math.exp(x);
        
        
        double estimated_exp_value_n_2 = recursive_exponential(x, 2);
        
        System.out.println("Exp(x) = "+ real_exp_value);
        System.out.println("Estimated Exp(x,2)= "+ estimated_exp_value_n_2);
       
        
        
        System.out.println("error = "+ Math.abs(real_exp_value-estimated_exp_value_n_2));
        System.out.println("----------------------------------------------");
        double estimated_exp_value = recursive_exponential(x, 20);
        
        System.out.println("Exp(x) = "+ real_exp_value);
        System.out.println("Estimated Exp(x,2)= "+ estimated_exp_value);
       
        
        
        System.out.println("error = "+ Math.abs(real_exp_value-estimated_exp_value));
        
    }
    
    
}
