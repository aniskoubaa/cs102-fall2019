package realestate.impl;

import java.util.ArrayList;
import realestate.interfaces.ITerrain;

public class Terrain extends RealEstate implements ITerrain{
    
    private boolean hasSink;
    ArrayList<GPS> boundaries = new ArrayList<GPS>();

    public Terrain(String id, String name, double surface, boolean hasSink) {
        super(id, name, surface);
        this.hasSink = hasSink;
    }

    public boolean isHasSink() {
        return hasSink;
    }

    public void setHasSink(boolean hasSink) {
        this.hasSink = hasSink;
    }

    public ArrayList<GPS> getBoundaries() {
        return boundaries;
    }

    public void setBoundaries(ArrayList<GPS> boundaries) {
        this.boundaries = boundaries;
    }

    @Override
    public String toString() {
        return String.format("{“type” : “terrain” , %s, “boundaries” : “%s” ",
                super.toString(), this.boundaries);
    }

}
