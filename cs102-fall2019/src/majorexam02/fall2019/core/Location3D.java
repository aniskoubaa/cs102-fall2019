package majorexam02.fall2019.core;

import majorexam02.fall2019.interfaces.ILocation;
import majorexam02.fall2019.interfaces.ILocation2D;
import majorexam02.fall2019.interfaces.ILocation3D;

public class Location3D extends Location2D implements ILocation3D{
    
    private double z;

    public Location3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    @Override
    public int compareTo(ILocation loc) {
        
        if (loc instanceof ILocation3D){
            
            if (super.compareTo(loc)!=0)
                return super.compareTo(loc);
            else if (this.z>((ILocation3D) loc).getZ())
                return 1;
            else if (this.z<((ILocation3D) loc).getZ())
                return -1;
            return 0;
            
        }else throw new IllegalArgumentException("location must be ILocation2D");
        
    }

    @Override
    public String toString() {
        return String.format("%s, %s", super.toString(), z);
    }

}


