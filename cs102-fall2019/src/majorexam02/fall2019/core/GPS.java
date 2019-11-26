package majorexam02.fall2019.core;

public class GPS extends Location3D{

    public GPS(double x, double y, double z) {
        super(x, y, z);
    }
    
    
    public void setLat(double lat){
        setX(lat);
    }
    
    public double getLat(){
        return getX();
    }
    
    public void setLon(double lon){
        setY(lon);
    }
    
    public double getLon(){
        return getY();
    }
    
    public double getAltitude(){
        return getZ();
    }
    
    public void setAltitude(double z){
        setZ(z);
    }
    

}


