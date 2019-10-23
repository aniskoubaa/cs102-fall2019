package topic03.polymorphism.shapes;


public class Rectangle extends TwoDShape{
    
    
    public Rectangle(String name, double length, double width){
        super(name, length, width);
    }
    
    public double getLength(){
        return getX();
    }
    
    public double getWidth(){
        return getY();
    }
    
    public void setLength(double length){
        setX(length);
    }
    
    public void setWidth(double width){
        setY(width);
    }
    
    @Override
    public double getArea(){
        return this.getLength()*this.getWidth();
    }
    
    public String toString(){
        return String.format("%s is a rectange (%.2f, %.2f)", 
                super.toString(), this.getLength(),
                this.getWidth());
    }
}
