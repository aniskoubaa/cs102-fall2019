package topic00.review;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileReview {
    
    public static void main(String []args) {
        
        
        //writing to a file.
        //specify the filename
        String filename = "cs102.txt";
        //create an object to access the file
        File file = new File(filename);
        
        try {        
            FileWriter fw = new FileWriter(file);
            fw.write("Welcome to CS102\n");
            fw.write("It is great");
            fw.close();
        } catch (IOException ex) {
            System.out.println("Error opening the file writer");
        }
        
        
        try {
            Scanner sc = new Scanner (file);
            while(sc.hasNext()){
                String line = sc.next();
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File error, does not exist");
        }
        
    }
    
}
