/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.image.project.core;

import designpattern.image.project.interfaces.Image;
import designpattern.image.project.interfaces.ImageFactory;

/**
 
 Then, write the class implementation of this interface called ImageFactoryImpl, which implements t
 * the interface ImageFactory.

The imageType can be either ‘gray’ for a gray Image or ’rgb’ for an RGB Image.

The method should return an Image, which is either a GrayImage or an RGBImage.

The class ImageFactoryImpl must follow a singleton design pattern.
 */
public class ImageFactoryImpl implements ImageFactory{
    
    private static ImageFactoryImpl instance = new ImageFactoryImpl();
    
    private ImageFactoryImpl(){
        
    }
    
    public static ImageFactoryImpl getInstance(){
        return instance;
    }
    

    @Override
    public Image getImage(String imageType, int width, int height, String name) {
        
        if (imageType.equalsIgnoreCase("gray"))
            return new GrayImageImpl(width, height, name);
        else if (imageType.equalsIgnoreCase("rgb"))
            return new RGBImageImpl(width, height, name);
        return null;
    }
    
}
