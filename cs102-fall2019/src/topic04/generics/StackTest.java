/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic04.generics;

public class StackTest {
    
    public static void main(String []args){
        
        Stack<String> stack = new Stack<String>();
        
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        
        stack.print();
        
        while (stack.size()>0){
            stack.pop();
            stack.print();
            System.out.println("--------");
                    
        }
        
        
        
    }
    
}
