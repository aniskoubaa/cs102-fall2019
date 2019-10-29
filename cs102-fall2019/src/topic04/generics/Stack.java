/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic04.generics;

import java.util.ArrayList;

/**
Exercise 2. Stack Class

Write a generic class called Stack<T> that represents a stack structure. 
* A stack structure follow the strategy last-in-first-out, which means that the last 
* element added to the stack, if the first to be taken out. The stack class has the following
* attributes and methods:

An attribute ArrayList<T> elements which represents the elements of the of the stack.
A constructor that creates the ArrayList
a method push(T e) which adds the element to the ArrayList<T>
a method pop() which removes the last element of the ArrayList<T> (last element added), 
* if the list is not already empty and returns it.
a method print() which prints the elements of the stack starting from the last element 
* to the first element.
Create a class StackDemo, in which you create two stacks, one stack of String 
* and one Stack of students, add elements, print, then remove all elements and then print.
 */
public class Stack <T>{
    
    private ArrayList<T> elements;
    
    public Stack(){
        elements = new ArrayList<T>();
    }
    
    public void push (T e){
        elements.add(e);//add at the end of the list
    }
    
    public int size(){
        return elements.size();
    }
    
    public T pop(){
        if (!elements.isEmpty())
            return elements.remove(elements.size()-1);//removes the last element in the list
        else return null;
    }
    
    
    public void print(){
        for (int i=elements.size()-1;i>=0;i--){
            System.out.println(elements.get(i));
        }
    }
    
    
}
