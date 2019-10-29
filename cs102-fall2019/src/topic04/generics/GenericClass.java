package topic04.generics;


public class GenericClass {
    
    
    public static void main(String []args){
        
       Pair<Student, Student> pairStudent = new Pair<Student, Student>();
       
        pairStudent.setKey(new Student("Mohamed", "Salah"));
        
        pairStudent.setValue(new Student("Ali", "Ahmed"));
        
        System.out.println(pairStudent);
        
        
  
        
    }
    
}
