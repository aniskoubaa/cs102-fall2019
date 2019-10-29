/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic05.designpatterns;


public class DatabaseStatic implements Readable{
    
    
   private static String name;

    
    //make the constructor as private
    public DatabaseStatic(String n) {
        name = n;
    }
    
    

    public static String getName() {
        return name;
    }

    public static void setName(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return "Database{" + "name=" + name + '}';
    }

    @Override
    public void read() {
        System.out.println(name);
    }
}
