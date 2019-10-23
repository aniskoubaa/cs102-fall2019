package topic03.polymorphism.shapes;


public class AbstractTest {
    
    public static void main(String []args){
        
        
        Shape shape = new Circle("C1", 5.1);
        
        System.out.println("area of the shape is: "+ shape.getArea());
        
        shape = new Rectangle("R1", 3.5, 9.2);
        
        System.out.println("area of the shape is: "+ shape.getArea());
        
    }
    
}
