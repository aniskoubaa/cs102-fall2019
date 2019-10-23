package topic03.polymorphism.shapes;


public abstract class Shape {
    
    private String name;
    
    
    public Shape (String name){
        setName(name);
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    //abstract method
    public abstract double getArea();
    
    @Override
    public String toString() {
        return "Shape" + name ;
    }

    
}
