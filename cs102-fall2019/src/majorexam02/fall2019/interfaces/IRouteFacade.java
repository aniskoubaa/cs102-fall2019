/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorexam02.fall2019.interfaces;

import java.util.List;


public interface IRouteFacade {
    
    public IRoute buildRoute(List<ICity> cities);
    public double routeLength(IRoute route);
    public void printRoute(IRoute route);
    public List<ICity> createCities(String country);
    
}
