package designpattern.image.project.interfaces;
/*
Now, you need to create a generic interface ImageProcessor, with a generic type I.

The generic type I must extend an Image.

The generic interface ImageProcessor has two methods. 

The first method is imwrite(…) and has two parameters: an image object of generic type I, and 
a String called filename.

The second method is called numberOfWhitePixels(…), which takes a parameter an 
image of generic type I. 
*/
public interface ImageProcessor <I extends Image>{
    
    public abstract boolean imwrite(I image, String fileName);
    public abstract int numberOfWhitePixels(I image);
    
}
