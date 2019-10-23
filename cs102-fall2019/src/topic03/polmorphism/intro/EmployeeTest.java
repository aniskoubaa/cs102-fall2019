
package topic03.polmorphism.intro;

import java.util.ArrayList;



public class EmployeeTest {
    public static void main(String [] args){
        
        Employee e1 = 
                new SalesEmployee
                        ("Mohamed", "Ali", "333-33-3333",
                                5000, 0.3);
        
        //Employee e3 = new Employee("Samir", "Sami", "222-22-00");
        
        //using polymorphism 
        Employee e2 = 
                new SalariedEmployee
                        ("Ahmed", "Mounir", "263-39-3333", 
                                5000, 0.04, 300);
        
        ArrayList<Employee> employees = new ArrayList<Employee>();
        
        employees.add(e1);
        employees.add(e2);
        employees.add(new SalariedEmployee
                        ("Salah", "Kamel", "263-39-3355", 
                                6000, 0.03, 400));
        
        
        //polymorphic processing
        
        for (Employee e : employees){
            
                if (e instanceof SalariedEmployee){
                SalariedEmployee se = (SalariedEmployee)e;
            
                System.out.println(se.getBaseSalary());
                }
            
        }
        //print all the total salary
        System.out.println("--------------");
        for (Employee e : employees){
            
            e.totalSalary();
            System.out.println(e.totalSalary());
            /*if (e instanceof SalariedEmployee){
                SalariedEmployee se = (SalariedEmployee)e;
                System.out.println(se.totalSalary());
                }
            else
            if (e instanceof SalesEmployee){
                SalesEmployee se = (SalesEmployee)e;
                System.out.println(se.totalSalary());
                }
                    */
        }        
        
    }
    
}
