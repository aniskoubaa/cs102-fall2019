package facebook.impl;


public class GraphTest {
    
    public static void main(String [] args){
        
        FacebookGraph FBG = FacebookGraph.getInstance();
        
        FBG.addUser(1, "Mohamed", "mohamed@gmail.com");
        FBG.addUser(2, "Kamal", "kamal@gmail.com");
        FBG.addUser(3, "Mounir", "mounir@gmail.com");
        FBG.addUser(4, "Ali", "ali@gmail.com");
        FBG.addUser(5, "Salah", "salah@gmail.com");
        
        
        FBG.addFriend(1, 4);
        FBG.addFriend(3, 1);
        FBG.addFriend(2, 3);
        FBG.addFriend(5, 3);
        FBG.addFriend(5, 1);
        FBG.addFriend(4, 2);
        
        System.out.println(FBG); 
        System.out.println(FBG.getFriendMap());
        System.out.println(FBG.getFriendsMap());
    }    
}
