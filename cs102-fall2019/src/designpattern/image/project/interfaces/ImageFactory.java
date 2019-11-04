/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.image.project.interfaces;

/**
 First, you need to create an interface called ImageFactory that contains 
 * one method getImage(…) with four parameters, including a String for the imageType, 
 * the width, the height, and its name. The method returns an Image object.
 */
public interface ImageFactory {
    
    public abstract Image getImage(String imageType, int width, int height, String name);
    
}
