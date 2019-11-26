package majorexam02.fall2019.interfaces;

import java.util.List;

public interface IRoute extends Comparable <IRoute>{
    
    public abstract List<IAddress> getPath();
    public abstract double getLength();
    
    public abstract ILocation getStartLocation();
    public abstract ILocation getDestinationLocation();
    
    
    
}

