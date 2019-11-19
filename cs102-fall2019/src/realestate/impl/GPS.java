package realestate.impl;


public class GPS {
    
    private double lat;//x
    private double lng;//y
    private double alt;//z

    public GPS(double lat, double lng, double alt) {
        this.lat = lat;
        this.lng = lng;
        this.alt = alt;
    }
    
    

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    @Override
    public String toString() {
        return "GPS{" + "lat=" + lat + ", lng=" + lng + ", alt=" + alt + '}';
    }
    
    
    
    
}
