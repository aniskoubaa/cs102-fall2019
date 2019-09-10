package topic01.classes;


public class StudentTest {
    
    public static void main(String []args){
        
        
        Date bd1 = new Date(1,3,1999);
        Student student1 = new Student("Mohamed","Ali",3.2,bd1);      
        student1.printInfo();
        //student1.firstName="Saber";
        student1.setFirstName("Saber");
        //student1.gpa=3.32;
        student1.setGpa(3.32);
        
        //student1.printInfo();
        
        //System.out.println("student 1 first name:"+ student1.getFirstName());
        
        
        System.out.println("number of students: "+ Student.getCount());
        
            
        Student student2 = new Student("Ahmed","Salah",2.8,new Date(12,2,1998));
        student2.printInfo();
        
        
        System.out.println("BD of ST2: "+ student2.getBirthDate());
        
        //change the day of the birth of student2 
        student2.setBirthDate(new Date(29,3,1998));
        //approach 2: change only the day value
        student2.getBirthDate().setDay(29);
        
        System.out.println("number of students: "+ Student.getCount());

        
        //Student student3 = new Student("Salah","Mounir",3.21);
        
        //student3.setBirthDate(new Date(2,4,1990));
       // System.out.println("ST3 BD: "+ student3.getBirthDate());
        //student3.getBirthDate().setDay(12);
        
        //student3.printInfo();
        System.out.println("number of students: "+ Student.getCount());
        
        Student student4 = new Student();
        //student4.firstName="Kamel";
        student4.setFirstName("Kamel");
        //student4.lastName="Mehdi";
        student4.setLastName("Mehdi");
        //student4.gpa=2.67;
        student4.setGpa(2.67);
        //student4.printInfo();
        
        
        //student4.gpa=-3.12;//this is not a valid GPA
        student4.setGpa(3.12);
        //student4.printInfo();
        
        //System.out.println("name of student4: "+ student4.getFirstName());
        
        System.out.println("number of students: "+ Student.getCount());
        
        
        
        System.out.println("student1: "+ student1);
        System.out.println("student2: "+ student2);
        
    }
    
}
