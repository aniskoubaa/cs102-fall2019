/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic08.recursion;

/**
 *
 * @author akoubaa
 */
public class Recursion {
    
    //FACTORIEL
    //if n = 0  ==> f(n)= 1
    //if n = 1  ==> f(n)= 1
    //if n = 2  ==> f(2)= 1 * 2 = f(1) * 2
    //if n = 3  ==> f(3)= 1 * 2 * 3 = f(2) * 3
    //if n = 4  ==> f(4)= 1 * 2 * 3 *4 = f(3) * 4
    //GENERAL CASE
    //f(n) = f(n-1) * n
    
    public static long recursive_factoriel(int n){
        
        if (n==0) return 1;
        if (n==1) return 1;
        
        
        System.out.println("n="+n);
        
        return recursive_factoriel(n-1) * n;
        
    }
    
    
    
    
    public static long iterative_factoriel(int n){
        
        int p = 1;
        for (int i=2;i<=n;i++){
            p=p*i;
        }
        
        return p;
    }
    
    public static void main(String []args){
        
        System.out.println(iterative_factoriel(10));
        System.out.println(recursive_factoriel(10));
    }
    
}
