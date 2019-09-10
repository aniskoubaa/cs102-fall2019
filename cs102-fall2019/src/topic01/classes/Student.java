package topic01.classes;


public class Student {
     
    private String firstName;
    private String lastName;
    private double gpa;
    
    private Date birthDate; 
    
    private static int count=0;
    
    
    //ensure data validation inside the constructor
    public Student(String fn, String ln, double the_gpa){
        //firstName = fn;
        setFirstName(fn);
        //lastName = ln;
        setLastName(ln);
        //gpa = the_gpa;
        setGpa(the_gpa);
        //birthDate=new Date(1,1,1990);
        count = count + 1;
        
    }
    
    public Student(String fn, String ln, double the_gpa, Date bd){
        this(fn, ln, the_gpa);
        setBirthDate(bd);
    }
    
    public Student(){
        count = count + 1;
    }
    
    public static int getCount(){
        return count;
    }
    
    
    public Date getBirthDate(){
        return birthDate;
    }
    
    public void setBirthDate(Date bd){
        birthDate = bd;
    }
    
    
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
   

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    
    //data validation
    public void setGpa(double gpa) {
        //set a constraint that gpa must be always positive
        if (gpa>0)
            this.gpa = gpa;
        else throw new IllegalArgumentException("gpa must be positive");
    }

    public void printInfo(){
        System.out.printf("%s %s has GPA %.2f\n", firstName,
                lastName,gpa);
    }
    
    @Override
    public String toString(){
        return String.format("%s %s", firstName, lastName);
    }
    
}
