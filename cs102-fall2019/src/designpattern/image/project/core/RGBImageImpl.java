package designpattern.image.project.core;


import designpattern.image.project.interfaces.Pixel;
public class RGBImageImpl extends ImageImpl {
    
    private Pixel [][]  img ;
    
    private int maxColor = 255;
    
    public RGBImageImpl(int width, int height, String name) {
        super(width, height, name);
        img = new RGBPixelImpl[height][width];
    }
    
    public RGBImageImpl(RGBImageImpl im) {
        super(im.getWidth(),im.getHeight(),im.getName());
        img = new RGBPixelImpl[im.getHeight()][im.getWidth()];
        img = im.getImg();
    }

    public Pixel[][] getImg() {
        return img;
    }

    public void setImg(RGBPixelImpl[][] img) {
        this.img = img;
    }

    @Override
    public void randomize() {
        for (int i=0;i<getHeight();i++){
               for (int j=0;j<getWidth();j++){
                   
                   img[i][j]= new RGBPixelImpl(new RGBColorImpl(
                           (byte)(Math.random()*maxColor),
                           (byte)(Math.random()*maxColor), 
                           (byte)(Math.random()*maxColor)));
               }
            }
    }
    
    public String toString(){
        return String.format("Color %s",super.toString());
    }
    

   
}
