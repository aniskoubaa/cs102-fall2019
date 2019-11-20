package facebook.impl;

import facebook.interfaces.EdgeFactory;
import facebook.interfaces.IGraph;
import facebook.interfaces.IVertex;
import facebook.interfaces.VertexFactory;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FacebookGraph 
implements IGraph<FacebookUser, FriendshipRelation> {
    
    private Set<FacebookUser> users=new HashSet<FacebookUser>();
    private Set<FriendshipRelation> relations=new HashSet<FriendshipRelation>();

    private FacebookRelationFactory facebookRelationFactory = new FacebookRelationFactory();
    private FacebookUserFactory facebookUserFactory = new FacebookUserFactory();
    
    
    
    
    /*************************************
     * question 05: 
     * Making the class a single instance 
     **************************************/
    
    
    
    
    /***********************************/
    
    public FacebookGraph(){ 
    }

    
    /*************************************
     * question 02: 
     * method: addUser 
     * addUser Grade: 2 points Duration: 5 minutes
    
    Now, in the class FacebookGraph, we would like to add a new user 
in the users Set<FacebookUser> of the class FacebookGraph. Write the method

public boolean addUser(int id, String name, String email)

that creates a new user using FacebookUserFactory, adds it to the 
* users Set<FacebookUser> and returns true if it is added correctly, and false otherwise.
     **************************************/
    public boolean addUser(int id, String name, String email){
        
        
        FacebookUser fu =  (FacebookUser)facebookUserFactory.create(id, name);
        fu.setEmail(email);
        
        return users.add(fu);
        
    }
    
    
    
    /***********************************/
    public Set<FacebookUser> getUsers(){
        return getVertices();
    }
    
    public Set<FriendshipRelation> getRelations(){
        return getEdges();
    }
    
    public boolean addUser(FacebookUser user){
        return users.add(user);
    }
    
    public FacebookUser getUser (int userID){
        Iterator <FacebookUser>it = users.iterator();
        while (it.hasNext()){
            FacebookUser u = it.next();
            if (u.getID()==userID)
                return u;
        }
        return null;
    }
    /*************************************
     * question 03: 
     * two methods: addFriend 
     * 
     * 
     * addFriend Grade: 3 points Duration: 10 minutes

Now, in the class FacebookGraph, 
* we would like to add a Friend in the relations Set<FriendshipRelation>.

Write the methods:

· public boolean addFriend(FacebookUser user1, FacebookUser user2): 
* that adds a friend relation between the two users specified by their IDs.

· public boolean addFriend(int userID1, int userID2): 
* that adds a friend relation between the two users specified by their IDs.
     * 
     **************************************/
    public boolean addFriend(FacebookUser user1, FacebookUser user2){
        
       FriendshipRelation fr= facebookRelationFactory.create(user1, user2);
       return relations.add(fr);
    }
    
    public boolean addFriend(int userID1, int userID2){
        
        FacebookUser user1=getUser(userID1);
        FacebookUser user2=getUser(userID2);
        
        /*for (FacebookUser fu : users){
            if (fu.getID()==userID1) user1 = fu;
            else if (fu.getID()==userID2) user2 = fu;
        }*/
        
       FriendshipRelation fr= facebookRelationFactory.create(user1, user2);
       return relations.add(fr);
    }
    
    
    
    /***********************************/
        
    @Override
    public Set<FacebookUser> getVertices() {
        return users;
    }

    @Override
    public Set<FriendshipRelation> getEdges() {
        return relations;
    }

    @Override
    public void setVertices(Set<FacebookUser> vertices) {
        users= vertices;
    }

    @Override
    public void setEdges(Set<FriendshipRelation> edges) {
        relations = edges;
    }

    @Override
    public void addVertex(FacebookUser v) {
        users.add(v);
    }

    @Override
    public void addEdge(FriendshipRelation v) {
        relations.add(v);
    }

    @Override
    public FriendshipRelation addEdge(FacebookUser sourceVertex, FacebookUser targetVertex) {
        FriendshipRelation fr = facebookRelationFactory.create(sourceVertex, targetVertex);
        relations.add(fr);
        return fr;
    }

    @Override
    public boolean containsEdge(FacebookUser sourceVertex, FacebookUser targetVertex) {
        Iterator <FriendshipRelation> it = relations.iterator();
        while (it.hasNext()){
            FriendshipRelation fr = it.next();
            boolean c1 = (fr.getSource().equals(sourceVertex));
            boolean c2 = (fr.getTarget().equals(targetVertex));
           
            if (c1 && c2)
                return true;
            
        }
        return false;
    }
    
    public boolean areFriends(FacebookUser sourceVertex, FacebookUser targetVertex){
        return (containsEdge(sourceVertex, targetVertex)||containsEdge(targetVertex,sourceVertex));
    }

    

    @Override
    public void printToFile(String fileName) {
        
    }

    @Override
    public void loadFromFile(String fileName) {
        
    }

    @Override
    public EdgeFactory getEdgeFactory() {
        return facebookRelationFactory;
    }
    
    @Override
    public VertexFactory getVertexFactory() {
        return facebookUserFactory;
    }
    
    /*************************************
     * question 04: 
     * method: getFriendsMap 
     **************************************/
    public Map <Integer, Friends> getFriendsMap(){
        
        Map <Integer, Friends> map = new TreeMap<Integer, Friends>();
        
        for (FacebookUser fu : users){
            
            Friends friends = new Friends();
            
            for (FriendshipRelation fr : relations){
                
                FacebookUser user1 = (FacebookUser)fr.getSource();
                FacebookUser user2 = (FacebookUser)fr.getTarget();
                
                if (fu.getID()==user1.getID()){
                    friends.add(user2.getID());
                }else if (fu.getID()==user2.getID()){
                    friends.add(user1.getID());
                
                
            }
            
         map.put(fu.getID(), friends);
        }
        
        return map;
    }
    
    
    
    
    
    /***********************************/
    
        
    
    /*************************************
     * question 06: 
     * method: loadGraph 
     **************************************/
    
    
    
    
    /***********************************/
    
    
    public String toString(){
        String s="";
        s=s+this.users.size()+"\n";
        for (FacebookUser u : users){
            s=s+u.toString()+"\n";
        }
        
        Set <Integer> idSet = getFriendMap().keySet();
        for (Integer id : idSet){
            s= s + id+":"+getFriendMap().get(id)+"\n";
        }
        return s;        
    }

    
}
