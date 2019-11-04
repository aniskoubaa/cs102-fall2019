package designpattern.image.project.interfaces;


public interface RGBColor extends Color{
    
    public abstract byte getRed();
    public abstract void setRed(byte red);
    
    public abstract byte getGreen();
    public abstract void setGreen(byte color);
    
    public abstract byte getBlue();
    public abstract void setBlue(byte blue);
    
}