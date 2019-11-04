package designpattern.image.project.core;


import designpattern.image.project.interfaces.Pixel;

public class GrayImageImpl extends ImageImpl{

    private Pixel [][]  img ;
    
    private int maxColor = 255;
    
    public GrayImageImpl(int width, int height, String name) {
        super(width, height, name);
        img = new GrayPixelImpl[height][width];
    }
    
    public GrayImageImpl(GrayImageImpl im) {
        super(im.getWidth(),im.getHeight(),im.getName());
        img = new GrayPixelImpl[im.getHeight()][im.getWidth()];
        img = im.getImg();
    }

    public Pixel[][] getImg() {
        return img;
    }

    public void setImg(GrayPixelImpl[][] img) {
        this.img = img;
    }

    @Override
    public void randomize() {
        for (int i=0;i<getHeight();i++){
               for (int j=0;j<getWidth();j++){
                   //System.out.println("i: "+i+"j: "+j );
                   img[i][j]=new GrayPixelImpl(new GrayColorImpl((byte)(Math.random()*maxColor)));
                   //img[i][j].setColor((byte)(Math.random()*maxColor));
               }
            }
    }

    
    public String toString(){
        return String.format("Gray %s",super.toString());
    }

    
    
    
}



