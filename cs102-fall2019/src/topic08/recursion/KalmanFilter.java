/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic08.recursion;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class KalmanFilter {
    public static double[] xk = {1000, 750, 563, 422, 316, 237, 178, 133, 100, 75};
    //public static double[] zk = {1145, 930, 492, 359, 292, 157, -22, 25, -60, 150};
    public static double[] zk={1185,808,402,417,248,155,103,16,149,90};
    //X_hat: [1000.0, 750.0000111093747, 562.5000141459955, 421.87501123353366, 316.40625863835936, 237.30469413277376, 177.97852056635418, 133.48389028624544, 100.11291767704276, 75.08468821970365]

    public static double x_hat = zk[0];
    public static double r = 0.01;
    public static double a = 0.75;
    public static double p = 1;
    public static double z = zk[0];
    public static double g = 0;
    public static double[] x_hat_array = new double[10];
    public static double[] p_array = new double[10];
    public static double[] g_array = new double[10];
    
    public static void main(String[] args) {
        
        for(double x: xk){
            System.out.printf("%.2f ", x);
        }
        System.out.println("");
        for(double x: zk){
            System.out.printf("%.2f ", x);
        }
        System.out.println("");
        
        System.out.printf("r=%.2f, p=%.2f, g=%.2f, z=%.2f\n", r, p, g, z);
        
        x_hat_array[0]=x_hat;
        p_array[0]=p;
        System.out.printf("x_hat=%.2f, g=%.2f, p=%.2f\n", x_hat,g,p);
        for(int i = 1; i<10; i++){
            predict();
            //System.out.printf("x_hat=%.2f, g=%.2f, p=%.2f\n", x_hat,g,p);
            update();
            //System.out.printf("x_hat=%.2f, g=%.2f, p=%.2f\n", x_hat,g,p);
            x_hat_array[i]=x_hat;
            p_array[i]=p;
            g_array[i]=g;
            z = zk[i];            
        }
        for(double d: x_hat_array){
            System.out.printf("%.2f ", d);
        }
        System.out.println("");
        System.out.println("X_hat: " + Arrays.toString(x_hat_array));
        System.out.println("P: " + Arrays.toString(p_array));
        System.out.println("G: " + Arrays.toString(g_array));
    }
    public static void predict(){
        x_hat *= a;
        p*= Math.pow(a, 2);
    }
    public static void update(){
        //System.out.printf("g= %.2f, p=%.2f, r=%.2f\n ",g,p,r);
        g = (p==0) ? 1 : p/(p+r); //0.05/(1+0.05)
        //System.out.printf(" ----> g= %.2f, p-=%.2f, r=%.2f\n ",g,p,r);
        x_hat = (x_hat + g *(z - x_hat));
        p = p*(1 - g);
    }
}



