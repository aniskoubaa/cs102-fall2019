package topic08.recursion;


public class Factorial {
    
    //n!=1x2x3x4...x(n-1)xn
    //0!=1  //BASE CASE
    //1!=1
    //2!=1x2=fact(1)*2
    //3!=1x2x3=fact(2)*3
    //4!=1x2x3x4=fact(3)*4
    //n!=fact(n)=fact(n-1)*n  //GENERAL CASE
    
    
    
    //recursion: a function calls itself
    public static long rfact(long number){
        //BASE CASE
        if (number == 0) return 1;
        if (number == 1) {
            System.out.println("fact(1)=1 is known. rolling back ");
            return 1;
        }
        //GENERAL CASE
        System.out.printf("fact(%d) = fact(%d)*%d is NOT known\n", number, number-1, number);
        return rfact(number-1)*number;
    }
    
    
    //iterative function 
    public static long factorial (long number){
        
        int product = 1;
        if (number == 0 ) return 1;
        if (number == 1 ) return 1;
        for (int i=2;i<=number;i++){
            product =product*i;
        }
        
        return product;
    }

    
    public static void main(String []args){
        
        
        
        int [] ints = {6};
        System.out.println("Factorial");
        for (int v : ints){
            System.out.printf("%d! = %d\n", v, rfact(v));
        }
        
        
    }
    
}
