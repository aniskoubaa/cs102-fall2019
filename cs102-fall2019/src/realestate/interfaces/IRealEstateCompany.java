package realestate.interfaces;

import java.util.List;

public interface IRealEstateCompany {
    
    public abstract List<IRealEstate> getRealEstates();
    public abstract String getName() ;
    public abstract void setName(String name) ;
    
}
