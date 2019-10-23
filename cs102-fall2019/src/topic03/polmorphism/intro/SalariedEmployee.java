package topic03.polmorphism.intro;


public class SalariedEmployee extends SalesEmployee{
    
    private double baseSalary; 
    
    public SalariedEmployee(String firstName, String lastName, 
            String id, double sales, double comission, 
            double salary){
            super(firstName, lastName, id, sales, comission);
            setBaseSalary(salary);
    }
    
    public void setBaseSalary(double baseSalary){
        if (baseSalary>0.0)
            this.baseSalary=baseSalary;
        else
            this.baseSalary=0.0;
    }
    
    public double getBaseSalary(){
        return baseSalary;
    }
    
    @Override //change the definition of the method
    public double totalSalary(){
        return baseSalary + super.totalSalary();
    }
    
    @Override
    public String toString(){
        return String.format("salaried and %s\n"
                + "base salary: %.2f", super.toString(), baseSalary);
    }
    
    /*
    public double totalSalary(){
        return commission*sales;//0.1 * 1000 = 100
    }
    */
    
    /*
    public String toString(){
        return String.format("sales employee: %s %s\n"
                + "id: %s \n"
                + "sales: %.2f \n"
                + "commission: %.2f", firstName, 
                lastName, id, 
                sales, commission);
    }
    */
    
}
