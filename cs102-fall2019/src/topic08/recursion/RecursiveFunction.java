package topic08.recursion;

public class RecursiveFunction {
   
    /*
    Consider the function 
    xn= x_(n-1)+x_(n-2)-x_(n-3)
    x0=0;
    x1=1;
    x2=2;   
    */
    public static int r_xn(int n){
       int x_n3=0;//x0
        int x_n2=2;//x1, n=3, n-2=1
        int x_n1=4;//x2 n=3, n-1=2
        
        int x_n = 0;
        if (n==0) return x_n3;
        if (n==1) return x_n2;
        if (n==2) return x_n1;
        return (r_xn(n-1)+r_xn(n-2)-r_xn(n-3));
        
        
        /*
        n=5
        return xn(4)+xn(3)+xn(2)
                           xn(2)=4=x2
                     xn(3)=xn(2)+xn(1)-xn(0)=4+2-0=6
               xn(4)=xn(3)+xn(2)+xn(1)=6+4-2=8
        xn(5)=8+6-4=10
        
        */
    }
    
    
    /*
    Consider the function 
    xn= x_(n-1)+x_(n-2)-x_(n-3)
    x0=0;
    x1=1;
    x2=2;   
    */
    //iterative version
    public static int xn(int n){
        //xn= x_(n-1)+x_(n-2)-x_(n-3)
        int xn3=0;//x0
        int xn2=2;//x1
        int xn1=4;//x2
        
        int xn = 0;
        if (n==0) return xn3;
        if (n==1) return xn2;
        if (n==2) return xn1;

        for (int i=3;i<=n;i++){
           xn= xn1+xn2-xn3;
           xn3=xn2;
           xn2=xn1;
           xn1=xn;
        }
        
        return xn;
        
    }
    
    public static void main(String []args){
      int [] ints = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,37};
        System.out.println("Iterative computation");
        for (int v : ints){
            System.out.printf("xn(%d) = %d\n", v, xn(v));
        } 
        
        System.out.println("Recursive computation");
        for (int v : ints){
           System.out.printf("xn(%d) = %d\n", v, r_xn(v));
        } 
        
    }
    
        
        
    
    
}
