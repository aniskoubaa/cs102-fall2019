/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic04.generics;

/**
 Exercise 1. Generic Linear Search

Implement the following generic method for linear search. public static <E extends Comparable<E>> 
* int linearSearch(E[] list, E value)

The method will take as parameter an Array of a generic type E, and a key of type E, 
* which represents the value to search for in the array. 

The method should return the index of the key in the list if it exists. 
* If it does not exist, it returns -1.
 */
public class Search {
    
    public static <E extends Comparable<E>> int linearSearch(E[] list, E value){
        
        
        for (int i=0;i<list.length;i++){
            if (list[i].compareTo(value)==0)
                return i;
            
        }
        return -1;
    }
    
    
    public static void main(String []args){
        
        Integer [] intArray = {1,5,7,3,9};
        
        System.out.println(linearSearch(intArray,7));
        
        Pair<String, Integer> [] pair = new Pair[2];
        Student [] students = new Student[2];
        
        students[0]= new Student("Salah","Mohamed");
        students[1]= new Student("Ahmed","Ali");
        
        System.out.println(linearSearch(students,new Student("Ali","Karim")));
        System.out.println(students[0]);
        
    }
    
}
