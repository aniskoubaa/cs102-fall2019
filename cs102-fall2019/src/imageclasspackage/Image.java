/*
 The Image Class
An Image is characterized by a width and the height, where width is number columns 
and  height is number of rows. In the above example, the width is 4 pixels and the height 
is 4 pixels. 
A pixel is just one cell in a matrix. So, the image is defined as a matrix of cells img, 
where each cells contains an integer number.
An image has a name.

The String representation of the class should display the image information as follow:

filename: random100.pgm 
width: 100 
height: 100
The class Image has a full argument constructor, default constructor and a copy constructor.

Write the class Image.
 */
package imageclasspackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Image {
        
    private int [][] img;//null  
    private int width;  
    private int height; 
    private String name;  
    
    public Image(int width, int height, String name) { 
        setWidth(width);  
        setHeight(height);  
        setName(name);  
        setImg(new int [width][height]); 
    }
    
    public Image(Image im){
        this(im.width,im.height,im.name);
        setImg(im.getImg());        
    }
    
    public Image(){
        
    }

    public int[][] getImg() {
        return img;
    }

    public void setImg(int[][] img) {
        this.img = img;
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
        return String.format("filename: %s \n" +
                            "width: %d \n" +
                            "height: %d", name, width, height);
    }
    
    
    /*
    The class Image has the method public boolean imread(String filename), 
    which reads an image from a file according to the structure as defined below for a 10 x 10 image:

P2
#Converted from MAP format
10 10
28 162 55 102 128 73 73 115 188 116
40 147 55 4 157 137 177 167 167 11
155 117 77 163 23 84 7 115 155 111
117 171 178 53 59 7 166 8 15 183
94 103 160 182 18 116 126 119 191 140
94 30 199 167 101 83 166 111 136 122
181 158 60 126 34 86 145 127 129 114
71 6 125 54 59 97 74 197 22 83
149 113 79 92 41 57 13 186 47 184
103 179 116 188 32 71 15 194 10 95

    In the first line, it is written P2, which is the format of the image.

The second line is just a comment to skip.

The third line contains the width = 10 and height = 10 of the image

The fifth line until the last line contains the values of the colors of the image matrix. You need to read these values and put them in the img matrix of the class Image.
    */
    
    public boolean imread(String filename){
        try {
            Scanner reader = new Scanner(new File(filename));  
            String type = reader.nextLine(); 
            reader.nextLine();  
            String size = reader.nextLine();  

            width = Integer.parseInt(size.split(" ")[0]); 
            height = Integer.parseInt(size.split(" ")[0]);
 
 
            name = filename;
            img=new int[height][width];
            int i=0; 
            while (reader.hasNextLine()){
                String line = reader.nextLine();  
                String [] colors = line.split(" ");  
                for (int j=0;j<width;j++){  
                    img[i][j]=Integer.parseInt(colors[j]);  
                }  
                i++;  
            }  
            return true;  
        } catch (FileNotFoundException ex) {  
            System.out.println("Image file not found");  
            return false;  
        }        
      }
    
    /*
    The class Image has the method public boolean imwrite(String filename), 
    which writes an image to a file according to the structure as defined above.
Write the method imwrite(filename).
    
       
    */
    
    public void printImage(){
        for (int i=0;i<height;i++){
                for (int j=0;j<width;j++){
                    System.out.print(img[i][j]+" ");
                }
                System.out.println();
            }
    }
    
    public boolean imwrite(String filename){
        try {
            FileWriter fw= new FileWriter(new File(filename));
            fw.write("P2\n");
            fw.write("#Converted from MAP format\n");
            fw.write(width+" "+height+"\n");
            for (int i=0;i<height;i++){
                for (int j=0;j<width;j++){
                    fw.write(img[i][j]+" ");
                }
                fw.write("\n");
            }
            fw.close();
            return true;
            
        } catch (IOException ex) {
            System.out.println("file error");
        }
        
        
        return false;
    }
    
}
