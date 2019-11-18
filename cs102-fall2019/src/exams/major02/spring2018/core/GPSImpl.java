/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exams.major02.spring2018.core;

import exams.major02.spring2018.interfaces.GPS;

/**
 *
 * @author akoubaa
 */
public class GPSImpl implements GPS{
    
    private double lat;
    private double lng;

    public GPSImpl(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }
    
    

    @Override
    public double getLat() {
        return lat;
    }

    @Override
    public double getLng() {
        return lng;
    }

    @Override
    public void setLat(double lat) {
        this.lat=lat;
    }

    @Override
    public void setLng(double lng) {
        this.lng= lng;
    }

    @Override
    public String toString() {
       return String.format("(%.4f, %.4f) \n",lat, lng);
    }
    
    
    
}
