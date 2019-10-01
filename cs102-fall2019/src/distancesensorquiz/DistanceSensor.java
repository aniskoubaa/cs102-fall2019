/*
 we use final to denote a constant value in Java. It can be changed only in the constructor when we create the object. 
 */
package distancesensorquiz;


public class DistanceSensor {
    
    private String id;
    private double range;
    
    private final double MAX_RANGE = 5.0;
    private final double MIN_RANGE = 0.2;

    public DistanceSensor(String id, double range) {
        setId(id);
        setRange(range);
    }
    
    public DistanceSensor(String id) {
       setId(id);
       range = 0.0;
    }
    
    public DistanceSensor(DistanceSensor ds) {
        this(ds.getId(), ds.getRange());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        
        this.id = id;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        if ((range<=MAX_RANGE)&&(range>=MIN_RANGE))
            this.range = range;
    }
    
    //{"id":"1", "range":"3.2", "MAX_RANGE":"5.0", "MIN_RANGE":"0.2"}
    public String toString(){
        return String.format("{\"id\":\"%s\", \"range\":\"%.2f\", \"MAX_RANGE\":\"%.2f\", \"MIN_RANGE\":\"%.2f\"}",
                id, range, MAX_RANGE, MIN_RANGE);
    }    
    
}
