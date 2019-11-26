package majorexam02.fall2019.interfaces;


public interface ICity extends IAddress, Comparable<ICity>{
    
    public abstract String getName();
    public abstract ILocation getLocation();

    
    public abstract void setName(String name);
    public abstract void setLocation(ILocation location);

    
    
}
