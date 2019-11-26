package majorexam02.fall2019.core;

import java.util.Comparator;
import majorexam02.fall2019.interfaces.ICity;


public class CityNameComparator implements Comparator<ICity>{

    @Override
    public int compare(ICity c1, ICity c2) {
        return c1.getName().compareTo(c2.getName());
    }
    
    
    
}
