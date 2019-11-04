package designpattern.image.project.core;

import designpattern.image.project.interfaces.Image;

public abstract class ImageImpl implements Image{
    
    private int width;
    private int height;
    private String name;

    public ImageImpl(int width, int height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return String.format("Image: name: %s\n"
                + "width: %d\n"
                + "heigh: %d\n",name,
                this.getWidth(),this.getHeight());
    }   
    
     @Override
    public int compareTo(Image img) {
        return (this.getWidth()*this.getHeight())-(img.getWidth()*img.getHeight());
    }
}
