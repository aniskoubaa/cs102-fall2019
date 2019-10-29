package topic05.designpatterns;


public class Database implements Readable{

    private String name;

    //early instantation 
    private static Database instance=null;
    
    
    //make the constructor as private
    private Database(String name) {
        this.name = name;
    }
    
    //lazy instantiation
    public static Database getInstance(){
        if (instance == null) //if the instance is not created
            instance = new Database("db1");//create the signle instance
        
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
