
package topic00.review;


public class ArrayReview {
    
    public static void main(String []args){
        
        
        int x =3;
        
        int [] intArray = {1,5,8,3,8};
        
        for (int i=0; i<intArray.length;i++){
            System.out.printf("intArray[%d]=%d\n",i,intArray[i]);
        }
        
        int [] intArray2 = new int[6];
        
        for (int i=0; i<intArray2.length;i++){
            System.out.printf("intArray2[%d]=%d\n",i,intArray2[i]);
        }
        
        intArray2[0]=7;
        intArray2[1]=13;
        
        for (int i=0; i<intArray2.length;i++){
            System.out.printf("intArray2[%d]=%d\n",i,intArray2[i]);
        }
        
        
        String [] strArray=new String [2];
        strArray[0]="Mohamed";
        strArray[1]="Ali";
        
        for (int i=0; i<strArray.length;i++){
            System.out.printf("strArray[%d]=%s\n",i,strArray[i]);
        }
        
        
        double [] doubleArray = new double [3];
        doubleArray[0]=1.2;
        doubleArray[1]=3.5;
        doubleArray[2]=7.4;
        
        for (int i=0; i<doubleArray.length;i++){
            System.out.printf("doubleArray[%d]=%.2f\n",i,doubleArray[i]);
        }
        
        
        int rows = 4;
        int cols = 3;
        
        int [] [] int2DArray = new int [rows][cols];
        
        for (int i = 0; i<int2DArray.length;i++){
            for (int j=0; j<int2DArray[i].length;j++){
                System.out.print(int2DArray[i][j]+"\t");
            }
            System.out.println("");
        }
        
        for (int i = 0; i<int2DArray.length;i++){
            for (int j=0; j<int2DArray[i].length;j++){
                int2DArray[i][j]=(int)(Math.random()*100);
            }
            
        }
        
        for (int i = 0; i<int2DArray.length;i++){
            for (int j=0; j<int2DArray[i].length;j++){
                System.out.print(int2DArray[i][j]+"\t");
            }
            System.out.println("");
        }
        
        
    }
    
}
