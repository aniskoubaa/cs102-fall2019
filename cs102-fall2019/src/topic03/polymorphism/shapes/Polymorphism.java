package topic03.polymorphism.shapes;

import java.util.ArrayList;


public class Polymorphism {
    
    public static void main(String []args){
        
        
        
        
        
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        shapes.add(new Circle("C1", 3.4));
        shapes.add(new Circle("C2", 6.4));
       
        shapes.add(new Rectangle("R1", 5, 9));
        shapes.add(new Rectangle("R2", 4, 39));
        
        
        shapes.add(new Square("S1", 3.4));
        shapes.add(new Square("S2", 6.4));
        
        
        
        //print the radius of the circle
        
        for (int i=0; i< shapes.size();i++){
            
            if (shapes.get(i) instanceof Circle){
                Circle c = (Circle) shapes.get(i);

                System.out.printf("radius of %s = %.2f\n", 
                        shapes.get(i).getName(),
                        c.getRadius());
            }else if(shapes.get(i) instanceof Square){
                Square s = (Square) shapes.get(i);

                System.out.printf("side of %s = %.2f\n", 
                        shapes.get(i).getName(),
                        s.getSide());
            }
            else if(shapes.get(i) instanceof Rectangle){
                Rectangle r = (Rectangle) shapes.get(i);

                System.out.printf("length of %s = %.2f\n", 
                        shapes.get(i).getName(),
                        r.getLength());
            }
            
            
        }
        
        
    }
    
}
