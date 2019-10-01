/*
 

 
Implement the class SensorGrid with all its methods and attributes using 
encapsulation.
 */
package distancesensorquiz;


public class SensorGrid {
    
    private DistanceSensor [][] sensors;
    private int gridLength; //number of rows of the matrix
    private int gridWidth; //the number of columns

    public SensorGrid(DistanceSensor[][] sensors, int gridLength, int gridWidth) {
        setSensors(sensors);
        setGridLength(gridLength);
        setGridWidth(gridWidth);
    }
    
    public SensorGrid(int gridLength, int gridWidth) {
        setSensors(new DistanceSensor [gridLength][gridWidth]);
        setGridLength(gridLength);
        setGridWidth(gridWidth);
    }
    
    public SensorGrid(SensorGrid sg){
        this(sg.getSensors(), sg.gridLength, sg.getGridWidth());
    }
    
    public SensorGrid(){
        
    }   
    

    public DistanceSensor[][] getSensors() {
        return sensors;
    }

    public void setSensors(DistanceSensor[][] sensors) {
        this.sensors = sensors;
    }

    public int getGridLength() {
        return gridLength;
    }

    public void setGridLength(int gridLength) {
        this.gridLength = gridLength;
    }

    public int getGridWidth() {
        return gridWidth;
    }

    public void setGridWidth(int gridWidth) {
        this.gridWidth = gridWidth;
    }
    
    public void add(DistanceSensor s, int i, int j){
        
        sensors[i][j]= s;
        
    }
    
    public void remove(int i, int j){
        
        sensors[i][j]= null;
        
    }
    
    public double max(){
        
        double max = -1;//initial value
        
        for (int i=0;i<sensors.length;i++){
           for (int j=0;j<sensors[i].length;j++){
               if (max<sensors[i][j].getRange())
                   max=sensors[i][j].getRange();
           } 
        }
        return max;        
    }
    
    
}
