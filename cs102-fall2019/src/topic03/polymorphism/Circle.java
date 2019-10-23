package topic03.polymorphism;


public class Circle extends Shape{
    
    private double radius;

    public Circle( String name, double radius) {
        super(name);
        this.radius = radius;
    }

   
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "circle "+super.toString()+" has a radius "+ radius;
    }
    
    
    
}
