/*
 ImageProcessor (7 points, duration 25 minutes)

Now, you need to create the generic class ImageProcessorImpl, 
which implements the generic interface ImageProcessor. 
The class ImageProcessorImpl has the same generic type I of the generic interface ImageProcessor.

You need to override the two methods of the interface as follow.

Method imwrite(…)
The method imwrite(…) should save an image to a file.

If the image is a GrayImage, then, the method imwrite(…) 
should save an image to a file in the same format as in previous quizzes and major exam.
You can reuse the same method imwrite(…) of previous exams and make necessary changes to it. 
Remind that the structure of the file is illustrated as follows:
 */
package designpattern.image.project.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import designpattern.image.project.interfaces.GrayColor;
import designpattern.image.project.interfaces.GrayImage;
import designpattern.image.project.interfaces.Image;
import designpattern.image.project.interfaces.ImageProcessor;
import designpattern.image.project.interfaces.Pixel;
import designpattern.image.project.interfaces.RGBColor;
import designpattern.image.project.interfaces.RGBImage;


public class ImageProcessorImpl <I extends Image> implements ImageProcessor<I>{

    @Override
    public boolean imwrite(I image, String filename) {
        
        
        if (image instanceof GrayImage){
        
            try {
                FileWriter fw = new FileWriter(new File(filename));

                for (int i=0;i<image.getHeight();i++){
                   for (int j=0;j<image.getWidth();j++){
                       byte color= ((GrayColor)(image.getImg()[i][j].getColor())).getColor();
                       String colorString = String.format("%d", color);
                       fw.write(colorString+" ");
                   }
                   fw.write("\n");
                }
                fw.close();
                return true;
            } catch (IOException ex) {
                System.out.println("Image IO Exception");
                return false;
            }       
        }
        else if (image instanceof RGBImage){
            try {
            FileWriter fw = new FileWriter(new File(filename));
            
            for (int i=0;i<image.getHeight();i++){
               for (int j=0;j<image.getWidth();j++){
                   byte R= ((RGBColor)(image.getImg()[i][j].getColor())).getRed();
                   byte B= ((RGBColor)(image.getImg()[i][j].getColor())).getBlue();
                   byte G= ((RGBColor)(image.getImg()[i][j].getColor())).getGreen();
                   String color = String.format("%s%s%s", Integer.toHexString(R),
                           Integer.toHexString(G),Integer.toHexString(B));
                   fw.write(color+" ");
               }
               fw.write("\n");
            }
            fw.close();
            return true;
        } catch (IOException ex) {
            System.out.println("Image IO Exception");
            return false;
        } 
            
        }
        return false;
    }

    @Override
    public int numberOfWhitePixels(I image) {
        
        int counter = 0;
        if (image instanceof GrayImage){
            
            for (int i = 0; i< image.getHeight();i++){
                for (int j = 0 ; j< image.getWidth();j++){
                    Pixel p = image.getImg()[i][j];
                    int c = ((GrayColor)(p.getColor())).getColor();
                    if (c==255)
                        counter++;
                }
            }
            
        }else if (image instanceof RGBImage){
            for (int i = 0; i< image.getHeight();i++){
                for (int j = 0 ; j< image.getWidth();j++){
                    Pixel p = image.getImg()[i][j];
                    int r = ((RGBColor)(p.getColor())).getRed();
                    int b = ((RGBColor)(p.getColor())).getBlue();
                    int g = ((RGBColor)(p.getColor())).getGreen();
                    if ((r==255)&&(b==255)&&(g==255))
                        counter++;
                }
            }
        }
        
        return counter;
        
    }

    
    
}
