
package topic05.designpatterns;


public class DatabaseTest {
    
    public static void main(String[]args){
        
        
        //only one database instance is created
        
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        Database db3 = Database.getInstance();
        
        
        
        System.out.println(db1);
        System.out.println(db2);
        System.out.println(db3);
        
        DatabaseStatic dbs1 = new DatabaseStatic("dbs1");
        System.out.println(dbs1);
        DatabaseStatic dbs2 = new DatabaseStatic("dbs2");
        System.out.println(dbs1);
        System.out.println(dbs2);
        
        
    }
    
}
