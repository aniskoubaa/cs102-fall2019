package designpattern.image.project.core;

import designpattern.image.project.interfaces.Color;
import designpattern.image.project.interfaces.RGBColor;

public class RGBColorImpl implements RGBColor{
 
    public byte Red;
    public byte Green;
    public byte Blue;

    public RGBColorImpl(byte R, byte G, byte B) {
        this.Red = R;
        this.Green = G;
        this.Blue = B;
    }
    
    public byte getRed() {
        return Red;
    }

    public void setRed(byte R) {
        this.Red = R;
    }

    public byte getGreen() {
        return Green;
    }

    public void setGreen(byte G) {
        this.Green = G;
    }

    public byte getBlue() {
        return Blue;
    }

    public void setBlue(byte B) {
        this.Blue = B;
    }
    
    public String toString(){
        return String.format("(%d,%d,%d)",Red,Green,Blue);
    }

    @Override
    public int compareTo(Color color) {
        if (color instanceof RGBColor){
            RGBColor rgb = (RGBColor)color;
            return (this.getBlue()+this.getGreen()+this.getRed())-(rgb.getBlue()+rgb.getGreen()+rgb.getRed());
        }
        return -9999;
    }
}
