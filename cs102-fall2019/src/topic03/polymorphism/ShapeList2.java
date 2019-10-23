/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic03.polymorphism;

import java.util.ArrayList;

/**
 *
 * @author akoubaa
 */
public class ShapeList2 {
    public static void main(String []args){
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        Circle c = new Circle("c1", 3.7);
        Square s = new Square ("s1", 2.9);
        Rectangle r = new Rectangle("r1",4.3, 7.5);
        
        shapes.add(new Circle("c2",5.4));
        shapes.add(c);
        shapes.add(r);
        shapes.add(s);
        
        System.out.println(shapes);
        
        
        //poylmorphic processing 
        
        for (Shape sh : shapes){
            //downcasting
            if (sh instanceof Circle){
                Circle cx = (Circle)sh;
                System.out.println(cx.getArea());
            }
            if (sh instanceof Square){
                Square sx = (Square)sh;
                System.out.println(sx.getArea());
            }
        }
        
    }
}
