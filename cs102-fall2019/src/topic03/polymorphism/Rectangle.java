
package topic03.polymorphism;


public class Rectangle extends Shape{
    
        private double height;
        private double width;

    public Rectangle(String name, double height, double width) {
        super(name);
        setHeight(height);
        setWidth(width);
    }
    
    public double getArea(){
        return height*width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    
    @Override
    public String toString() {
        return "rectangle "+super.toString()+" has a length "+ height+" has a width "+ width;
    }
    
}

