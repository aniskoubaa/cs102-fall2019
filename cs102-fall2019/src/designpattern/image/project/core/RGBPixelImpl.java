package designpattern.image.project.core;

import designpattern.image.project.interfaces.Pixel;
import designpattern.image.project.interfaces.Color;
import designpattern.image.project.interfaces.RGBColor;

public class RGBPixelImpl implements Pixel{
    
    public RGBColor rgb;


    public RGBPixelImpl(RGBColor rgb) {
        
    }
    public RGBPixelImpl(RGBPixelImpl cp) {
        
    }
    
       
    public String toString(){
        return String.format("(%s)",rgb);
    }

    @Override
    public Color getColor() {
        return rgb;
    }

    @Override
    public void setColor(Color color) {
       if (color instanceof RGBColor)
        rgb = (RGBColor)color;
    }

    @Override
    public int compareTo(Pixel pixel) {
        return this.getColor().compareTo(pixel.getColor());
    }
    
}
