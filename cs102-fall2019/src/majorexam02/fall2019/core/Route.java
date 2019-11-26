package majorexam02.fall2019.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import majorexam02.fall2019.interfaces.IAddress;
import majorexam02.fall2019.interfaces.ICity;
import majorexam02.fall2019.interfaces.ILocation;
import majorexam02.fall2019.interfaces.IRoute;

public class Route implements IRoute{
    
    private List<IAddress> route = new ArrayList<IAddress>();

    public Route() {
    }

    public List<IAddress> getRoute() {
        return route;
    }

    public void setRoute(List<IAddress> route) {
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
            len = len +GPSDistanceCalculator.distance(((City)(route.get(i))).getLocation(), 
                ((City)(route.get(i))).getLocation(), "K");
        }
        return len;
    }
    

    
    
    
    
    public void setRouteWithNoDuplicates(Collection<IAddress> cities) {
        //make it empty
        //route=new ArrayList<IAddress>();
        route.addAll(new HashSet<IAddress>(cities));
    }
    
    public boolean isValid(){
        City startLocation = (City)(this.getRoute().get(0));
        City destinationLocation = (City)(this.getRoute().get(this.getRoute().size()-1));
        if (startLocation.getName().compareTo(destinationLocation.getName())!=0)
            return false;
        if (!startLocation.getName().equalsIgnoreCase(destinationLocation.getName()))
            return false;
        List<IAddress> tourList = this.getRoute();
        tourList.remove(tourList.size()-1);//remove the last elemet that is destination which is equal to start
        Set<IAddress> tourSet = new HashSet<IAddress>(this.getRoute());
        if (tourList.size()!=tourSet.size())
            return false;
        return true;
    }



    @Override
    public String toString() {
        return "Route{" + "route=" + route + '}';
    }

    @Override
    public List<IAddress> getPath() {
        List<IAddress> cityList = new ArrayList<IAddress>(route);
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



