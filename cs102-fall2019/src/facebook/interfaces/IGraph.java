package facebook.interfaces;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface IGraph<V extends IVertex, E extends IEdge>
{
    
    public abstract Set<V> getVertices();
    public abstract Set<E> getEdges();
    
    public abstract void setVertices(Set<V> vertices);
    public abstract void setEdges(Set<E> edges);
    
    
    public abstract void addVertex(V v);
    public abstract void addEdge(E v);
    E addEdge(V sourceVertex, V targetVertex);
    
    boolean containsEdge(V sourceVertex, V targetVertex);

    
    public abstract void printToFile(String fileName);
    public abstract void loadFromFile(String fileName);
    
    EdgeFactory getEdgeFactory();
    public VertexFactory getVertexFactory();
}
