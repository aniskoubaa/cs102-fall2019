/*
 Write a test program SensorTest that:
• Creates the SensorGrid with 3x3 matrix.
• Sensors ID are from 1 to 9
• All sensors have a MAX_RANGE of 5.0 meters
• Set random distances to these sensors
• Print the max distance.
 */
package distancesensorquiz;


public class SensorTest {
    
    public static void main(String []args){
        
        SensorGrid sg = new SensorGrid(3,3);
        int counter = 1;
        for (int i=0;i<sg.getGridLength();i++){
           for (int j=0;j<sg.getGridWidth();j++){
               sg.getSensors()[i][j]=new DistanceSensor(counter+"", Math.random()*5.0);
               //sg.getSensors()[i][j].setId(counter+"");
               counter++;
               //sg.getSensors()[i][j].setRange(Math.random()*5.0);
           } 
        }
        
        System.out.println("max distance: "+ sg.max());
        
    }
    
}
