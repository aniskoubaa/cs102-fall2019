package topic03.polymorphism.shapes;

import java.util.ArrayList;

public class ShapeTest {
    
    public static void main(String []args){
        

        ArrayList<Circle> circles = new ArrayList<Circle>();
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        ArrayList<Square> squares = new ArrayList<Square>();
        
        
        circles.add(new Circle("C1", 3.4));
        circles.add(new Circle("C2", 6.4));
        
        //circles.add(new Rectangle("R1", 5, 9));
        

        rectangles.add(new Rectangle("R1", 5, 9));
        rectangles.add(new Rectangle("R2", 4, 39));
        
        
        squares.add(new Square("S1", 3.4));
        squares.add(new Square("S2", 6.4));
        
        for (int i = 0; i<circles.size();i++){
            System.out.printf("radius of %s = %.2f\n", 
                    circles.get(i).getName(),
                    circles.get(i).getRadius());
        }
        
        for (int i = 0; i<rectangles.size();i++){
            System.out.printf("length of %s = %.2f\n", 
                    rectangles.get(i).getName(),
                    rectangles.get(i).getLength());
        }
        
        for (int i = 0; i<squares.size();i++){
            System.out.printf("length of %s = %.2f\n", 
                    squares.get(i).getName(),
                    squares.get(i).getSide());
        }

    }   
}
