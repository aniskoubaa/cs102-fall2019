/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic00.review;

import java.util.ArrayList;

/**
 *
 * @author akoubaa
 */
public class ArrayReview {
       public static void printArray(int [] A){
        for (int i = 0;i<A.length;i++){
            System.out.printf("A[%d]= %d\n", i,A[i]);
        }
    }
    
    public static void main(String []args){
        
        //one dimensional array
        int n = 1;
        double x = 0.2;
        String s = "ABC";
        
        int [] intArray = new int [3];
        double [] doubleArray = new double [6];
        String [] strArray = {"A", "U"};
        
        printArray(intArray);
        
        intArray[0]=5;
        intArray[1]=6;
        intArray[2]=7;
        
        printArray(intArray);
        
        for (int i = 0;i<strArray.length;i++){
            System.out.printf("A[%d]= %s\n", i,strArray[i]);
        }
        
        //multi dimensional array
        int nRows = 3;
        int nCols = 2;
        double [][] matrix = new double [nRows][nCols];
        
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0; j<matrix[i].length;j++){
                System.out.printf("A[%d][%d] : %s\n", i,j,matrix[i][j]);
            }
        }
        
    
        
        
    }
    
    
}
