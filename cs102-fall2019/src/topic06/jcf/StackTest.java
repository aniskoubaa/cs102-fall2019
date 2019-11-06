/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;


public class StackTest {
    
    public static void main(String []args){
        
        
        
        Stack <Integer>stack = new Stack<Integer>();
        
        stack.push(4);
        stack.push(8);
        stack.push(6);
        
        System.out.println(stack);
     
        while(!stack.empty()){
            stack.pop();
            System.out.println(stack);
            
        }
        
        
        Queue<String> queue = new PriorityQueue<String>();
        queue.offer("Ali");
        queue.add("Mohamed");
        queue.add("Salah");
        queue.add("Mounir");
        queue.add("Ahmed");
        System.out.println(queue);
        
        queue.peek();
        System.out.println(queue.peek());
        System.out.println(queue);
        
        
        
        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        System.out.println(queue);
        
        }
        
        Queue<Student> stdQueue = new PriorityQueue<Student>(4, new StudentComparator());
        stdQueue.add(new Student("Mounir", "Salah", 32));
        stdQueue.add(new Student("Mohamed", "Ali", 25));
        stdQueue.add(new Student("Ahmed", "Kamal", 27));
        
        System.out.println(stdQueue);
        
        
    }
    
}
