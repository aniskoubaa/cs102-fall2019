/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageclasspackage;


public class ImageTest {
    public static void main(String []args){
        
        String name = "image.pgm";
        Image image = new Image (10,10, name);
        
        image.imread(name);
        image.printImage();
        System.out.println(image);
        
        image.imwrite("copy-"+name);
        
        
    }
}
