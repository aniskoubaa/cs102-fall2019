
package topic03.polymorphism;


public class ShapeTest {
    
    
    public static void main(String []args){
        
        Shape shape = new Shape("Shape1");
        
        Shape c = new Circle("c1", 3.7);
        Shape s = new Square ("s1", 2.9);
        Shape r = new Rectangle("r1",4.3, 7.5);
        
        //downcasting: cast from the superclass to the subclass
        //if r is an object of type Cirlce
        Shape sh= r;
        if (sh instanceof Circle){
            Circle c1 = (Circle) sh;
            System.out.println("area of c: "+ c1.getArea());
        }else{
            System.out.println("the object is not an instance of Cirlce");
        }
        
        System.out.println("area of c: "+ ((Circle)c).getArea());
    }
    
}
