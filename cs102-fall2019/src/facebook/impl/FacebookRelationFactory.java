package facebook.impl;

import facebook.interfaces.EdgeFactory;

/*
FacebookRelationFactory Grade: 3 points  Duration: 10 minutes

Create the class FacebookRelationFactory that creates a new friendship relation. 
It implements EdgeFactory<E,V>, where E is the Edge as FriendshipRelation 
and V is the vertex as FacebookUser.

In addition to overriding the method of the interface, it has a method called

create(user1, user2, date) that creates a relation between user1 and user2 
at a certain date.

Write the class FacebookRelationFactory.
*/

/** question 01 **/
public class FacebookRelationFactory implements EdgeFactory<FriendshipRelation,FacebookUser>{

    @Override
    public FriendshipRelation create(FacebookUser source, FacebookUser target) {
        return new FriendshipRelation(source, target);
    }
    

    public FriendshipRelation create(FacebookUser source, FacebookUser target, Date date) {
        return new FriendshipRelation(source, target, date);
    }
    
    
        
}
