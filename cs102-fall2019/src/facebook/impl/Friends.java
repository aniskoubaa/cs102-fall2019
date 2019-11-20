
package facebook.impl;

import java.util.Set;
import java.util.TreeSet;


public class Friends {
    Set <Integer> friends = new TreeSet<Integer>(); 
    
    public void add(Integer userID){
        friends.add(userID);
    }
    
    public void remove(Integer userID){
        friends.remove(userID);
    }
    
    public boolean contains(Integer userID){
        return friends.contains(userID);
    }
    
    public String toString(){
        return friends.toString();
    }
}
