
package topic03.polymorphism;


public class Square extends Shape{
    
        private double side;

    public Square(String name, double radius ) {
        super(name);
        this.side = radius;
    }
    
    public double getSide() {
        return side;
    }
    
    public double getArea(){
        return side *side;
    }

    public void setSide(double radius) {
        this.side = radius;
    }

    @Override
    public String toString() {
        return "square "+super.toString()+" has a side "+ side;
    }
    
}
