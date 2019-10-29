
package majorexam.fall2019.core;

import majorexam.fall2019.interfaces.ILocation;
import majorexam.fall2019.interfaces.ILocation2D;


public class Location2D implements ILocation2D{
    
    private double x;
    private double y;

    public Location2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", x, y);    
    }

    @Override
    public int compareTo(ILocation loc) {
        
        if (loc instanceof ILocation2D){
            
            if (this.x>((ILocation2D) loc).getX())
                return 1;
            else if (this.x<((ILocation2D) loc).getX())
                return -1;
            else if (this.y>((ILocation2D) loc).getY())
                return 1;
            else if (this.y<((ILocation2D) loc).getY())
                return -1;
            else
            return 0;
            
        }else throw new IllegalArgumentException("location must be ILocation2D");
        
    }
    
   
}

