package topic03.polymorphism.shapes;


public class Square extends TwoDShape{
    

    public Square (String name, double side){
        super(name,side,1);
        //setX(side); 
    }

    public double getSide() {
        return this.getX();
    }

    public void setSide(double side) {
        setX(side);
    }
    
    //implementation of getArea() for the class Square
    @Override
    public double getArea(){
        return getSide()*getSide();
    }
    

        
    public String toString(){
        return String.format("%s is a square (%.2f)", 
                super.toString(), getSide());
    }

    
}
