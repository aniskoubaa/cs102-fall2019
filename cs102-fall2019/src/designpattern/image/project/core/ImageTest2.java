/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.image.project.core;

import designpattern.image.project.interfaces.GrayImage;
import designpattern.image.project.interfaces.Image;
import designpattern.image.project.interfaces.ImageFactory;
import designpattern.image.project.interfaces.ImageProcessor;
import designpattern.image.project.interfaces.RGBImage;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akoubaa
 */
public class ImageTest2 {
    public static void main(String [] args){
        List<Image> images = new ArrayList<Image>();
 
       //TASK 1. create an instance of Image Factory  
        ImageFactory imf = ImageFactoryImpl.getInstance();
  
        //TASK 2. replace the creation of the following images using the ImageFactory class. 
        
        /*images.add(new GrayImageImpl(40, 60, "gimage02.png"));  
        images.add(new GrayImageImpl(50, 70, "gimage03.png"));       
        images.add(new RGBImageImpl(25, 30, "cimage01.bmp"));  
        images.add(new RGBImageImpl(40, 60, "cimage02.bmp"));  
        images.add(new RGBImageImpl(50, 70, "cimage03.bmp"));  
        */
        
        //GrayImage img = new GrayImageImpl(50, 70, "gimage03.png");
    
        images.add(imf.getImage("gray", 250, 300, "gimage01.png"));
        images.add(imf.getImage("gray", 40, 60, "gimage02.png"));  
        images.add(imf.getImage("rgb", 10, 10, "cimage01.png"));  
        images.add(imf.getImage("rgb", 60, 40, "cimage01.png"));  

        GrayImage gray_image = (GrayImageImpl)(images.get(0));  
        gray_image.randomize();  
        RGBImage rgb_image = (RGBImageImpl)(images.get(2));  
        rgb_image.randomize();
  
        //TASK 3. create an image processor for the GrayImage type  
        ImageProcessor <GrayImage> ipgray = new ImageProcessorImpl<GrayImage>();

        //TASK 4. create an image processor for the RGBImage type 
        ImageProcessor <RGBImage> iprgb = new ImageProcessorImpl<RGBImage>();
  
        //TASK 5. write the two images gray_image and rgb_image in files   
        ipgray.imwrite(gray_image, "im-gray.pgm");  
        //iprgb.imwrite(rgb_image, "im-rgb.pgm");       

  
        //TASK 6. get the number of white pixels for the gray_image
        int count_gray = ipgray.numberOfWhitePixels(gray_image);  
        System.out.println("count gray: "+count_gray); 
        

  
        //TASK 7. get the number of white pixels for the rgb_image  
        //int count_rgb = iprgb.numberOfWhitePixels(rgb_image);  
        //System.out.println("count rgb: "+count_rgb);  
    }  
}
