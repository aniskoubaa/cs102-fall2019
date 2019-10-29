package majorexam.fall2019.core;

import java.util.ArrayList;
import java.util.List;
import majorexam.fall2019.interfaces.ICity;
import majorexam.fall2019.interfaces.ILocation;
import majorexam.fall2019.interfaces.IRoute;

public class Route implements IRoute{
    
    private List<City> route = new ArrayList<City>();

    public Route() {
    }

    public List<City> getRoute() {
        return route;
    }

    public void setRoute(List<City> route) {
        this.route = route;
    }
    
    public void add(City city){
        route.add(city);
    }
    
    public void remove(City city){
        route.remove(city);
    }
    
    public double length(){
        double len = 0.0;
        for (int i=0;i<route.size()-1;i++){
            len = len +GPSDistanceCalculator.distance(route.get(i).getLocation(), 
                route.get(i+1).getLocation(), "K");
        }
        return len;
    }

    @Override
    public String toString() {
        return "Route{" + "route=" + route + '}';
    }

    @Override
    public List<ICity> getPath() {
        List<ICity> cityList = new ArrayList<ICity>(route);
        return cityList;
    }

    @Override
    public double getLength() {
        return length();
    }

    @Override
    public ILocation getStartLocation() {
        return route.get(0).getLocation();
    }

    @Override
    public ILocation getDestinationLocation() {
        return route.get(route.size()-1).getLocation();
    }


    @Override
    public int compareTo(IRoute r) {
        
        if (this.getLength()-r.getLength()>0)
            return 1;
        else if (this.getLength()-r.getLength()<0)
            return -1;
        else return 0;
        
    }

}



