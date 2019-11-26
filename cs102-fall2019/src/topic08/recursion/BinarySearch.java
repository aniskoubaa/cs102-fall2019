
package topic08.recursion;


public class BinarySearch {
  
    public static int binarySearch(int [] A,int key){
        
       int numberOfOperations =0;
        
       int middle_index = A.length/2;
       int low_index = 0;
       int high_index=A.length-1;
       int position = -1;
        
       do{
           numberOfOperations++;
           if (key == A[middle_index]){
               position = middle_index;
           } 
           else if (key<A[middle_index])
                   high_index = middle_index-1; 
           else
                   low_index = middle_index+1;
            
        middle_index = (high_index+low_index+1)/2;
            
       }while((high_index>=low_index)&&(position==-1));
        
       System.out.println("Number of operations (Binary Search) = "+numberOfOperations);
       return position;
   }
    
    public static int rbinarySearch(int [] A,int key){
        int low=0;
        int high= A.length-1;
        return rbinarySearch(A,key, low, high);
        
    }
    
    public static int rbinarySearch(int [] A,int key, 
                                    int low, int high){
        if (low>high){
            return -low-1; ///the array has been exhausted without a match
        }
        
        int mid = (low+high)/2;
        if (key<A[mid]){
            return rbinarySearch(A,key, low, mid-1);
        }else if (key == A[mid]){
            return mid;
        } else {//key>A[mid]
            return rbinarySearch(A,key, mid+1,high);
        }
    }
            
    
  public static void main (String []args){
       
      int max_value = 700000000;
      //create and declare the array
      int [] array = new int [max_value];
       
      //populate the array in increasing order
       for (int i = 0; i<max_value; i++){
           array[i]=i; 
       }
        
       int searchValue = max_value-1;
        
      long t2= System.currentTimeMillis();
      int location = binarySearch(array,searchValue);
      long t3= System.currentTimeMillis();
      System.out.printf("Binary Search \nBinary search time: %d ms\n\tLocation: %d\n", (t3-t2), location);
 
      
      t2= System.currentTimeMillis();
      location = rbinarySearch(array,searchValue);
      t3= System.currentTimeMillis();
      System.out.printf("\n\nRecursive Binary Search \nBinary search time: %d ms\n\tLocation: %d\n", (t3-t2), location);
 
      
      
  }
    
}
