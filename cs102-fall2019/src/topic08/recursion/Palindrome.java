/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic08.recursion;

import java.util.Scanner;


public class Palindrome {
 
    /**
     * version 1: less efficient as it creates a new string for every recursive call
     * @param s: string
     * @return : if symmetric or not
     */
    
    public static boolean isPalindrome_v1(String s)
    {   // if length is 0 or 1 then String is palindrome
        System.out.println(s);
        if(s.length() == 0 || s.length() == 1)
            return true; 
         
        if(s.charAt(0) == s.charAt(s.length()-1)) //base case
        /* check for first and last char of String:
         * if they are same then do the same thing for a substring
         * with first and last char removed. and carry on this
         * until you string completes or condition fails
         * Function calling itself: Recursion
         */
           
        return isPalindrome_v1(s.substring(1, s.length()-1));

        /* If program control reaches to this statement it means
         * the String is not palindrome hence return false.
         */
        return false;
    }
    
    /**
     * version 2: more efficient: uses a helper method
     * @param s: string
     * @return : if symmetric or not
     */
    
    public static boolean isPalindrome_v2(String s)
    {   
        return isPalindrome(s, 0, s.length()-1);
    }
    
    public static boolean isPalindrome(String s, int low, int high) {   
        if (high<=low){
            return true;
        }else if (s.charAt(low)!=s.charAt(high)){
            return false;
        }
        else return isPalindrome(s, low+1, high-1);
    }
 
 
 
     public static void main(String[]args)
    {
    	//For capturing user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String string = scanner.nextLine();
        /* If function returns true then the string is
         * palindrome else not
         */
        if(isPalindrome_v1(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }
}
