package facebook.impl;

import facebook.interfaces.IVertex;
import facebook.interfaces.VertexFactory;

public class FacebookUserFactory implements VertexFactory{

    @Override
    public IVertex create() {
        return new FacebookUser();
    }
    
    @Override
    public IVertex create(int id, String data) {
        return new FacebookUser(id, data);
    }
    
}
