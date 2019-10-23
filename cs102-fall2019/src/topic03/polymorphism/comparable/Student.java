package topic03.polymorphism.comparable;



public class Student implements Comparable<Student>{
   
    private String firstName;
    private String lastName;
    private  int age;//comparison criteria
    
    public Student(String fn, String ln, int age){
        setFirstName(fn);
        setLastName(ln);
        setAge(age);
    }

    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        if (age>0)
            this.age = age;
        //throw an exception
        else throw new IllegalArgumentException("age must be greater than 0");
    }

    @Override
    public String toString() {
        return String.format("%s %s (%d)", firstName, lastName, age);
    }

    @Override
    public int compareTo(Student s) {
        /*if (this.age>s.age)
            return 1;
        else if (this.age<s.age)
            return -1;
        else return 0;*/
        
        return this.age-s.age;
        
        /*if (this.firstName.compareTo(s.firstName)<0)
            return -1;
        else if (this.firstName.compareTo(s.firstName)>0)
            return 1;
        else return 0;*/
        
        //return this.firstName.compareTo(s.firstName);
        
    }
   
    
}
