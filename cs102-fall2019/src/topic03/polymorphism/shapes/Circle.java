package topic03.polymorphism.shapes;


public class Circle extends TwoDShape{
    
    
    public Circle(String name, double radius){
        //assign radius to x
        super(name, radius, 1);
    }
    
    public void setRadius(double radius){
        setX(radius);
    }
    
    public double getRadius(){
        return getX();
    }
    
    @Override
    public double getArea(){
        return getRadius()*getRadius()*Math.PI;
    }
    
   
          
    public String toString(){
        return String.format("%s is a circle (%.2f)", 
                super.toString(), getRadius());
    }
 
}
