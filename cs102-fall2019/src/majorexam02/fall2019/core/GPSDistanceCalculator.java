package majorexam02.fall2019.core;

/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
/* This class provides the method distance 
that calculate the distance between two GPS locations. 
/*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GPSDistanceCalculator
{
        /* 
         * uncomment this method during the exam and user it    
         *
         *
        public static double distance(GPS l1, GPS l2, String unit){
            return distance(l1.getLat(), l1.getLon(), l2.getLat(), l2.getLon(), unit);
        }
        */
    
    
    
        public static double distance(GPS gps1, GPS gps2, String unit) {
		double theta = gps1.getLon() - gps2.getLon();
		double dist = Math.sin(deg2rad(gps1.getLat())) * Math.sin(deg2rad(gps2.getLat())) + Math.cos(deg2rad(gps1.getLat())) * Math.cos(deg2rad(gps2.getLat())) * Math.cos(deg2rad(theta));
		dist = Math.acos(dist);
		dist = rad2deg(dist);
		dist = dist * 60 * 1.1515;
		if (unit == "K") {
			dist = dist * 1.609344;
		} else if (unit == "N") {
			dist = dist * 0.8684;
		}

		return (dist);
	}

	public static double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
		double theta = lon1 - lon2;
		double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
		dist = Math.acos(dist);
		dist = rad2deg(dist);
		dist = dist * 60 * 1.1515;
		if (unit == "K") {
			dist = dist * 1.609344;
		} else if (unit == "N") {
			dist = dist * 0.8684;
		}

		return (dist);
	}

	/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
	/*::	This function converts decimal degrees to radians						 :*/
	/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
	private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}

	/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
	/*::	This function converts radians to decimal degrees						 :*/
	/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
	private static double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	}
        
        public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "M") + " Miles\n");
		System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "K") + " Kilometers\n");
		System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, "N") + " Nautical Miles\n");
	}
}
