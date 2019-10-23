package topic03.polymorphism;

import java.util.ArrayList;


public class ShapeList {
    
    public static void main(String []args){
        
        ArrayList<Circle> circles = new ArrayList<Circle>();
        ArrayList<Square> squares = new ArrayList<Square>();
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        //Shape shape = new Shape("Shape1");
        Circle c = new Circle("c1", 3.7);
        Square s = new Square ("s1", 2.9);
        Rectangle r = new Rectangle("r1",4.3, 7.5);
        
        circles.add(new Circle("c2",5.4));
        //circles.add(r);
        rectangles.add(r);
        //rectangles.add(new Circle("c2",5.4));
        squares.add(s);
        
       
        shapes.add(new Circle("c2",5.4));
        shapes.add(c);
        shapes.add(r);
        shapes.add(s);
        
        System.out.println(shapes);
        
        for (Circle cr: circles){
            System.out.println(cr.getArea());
        }
        
        //print the area of all circles
        for ((Shape shape: shapes)){
            Circle circle = (Circle)shape;
            System.out.println(circle.getArea());
        }
        
    }
    
}
