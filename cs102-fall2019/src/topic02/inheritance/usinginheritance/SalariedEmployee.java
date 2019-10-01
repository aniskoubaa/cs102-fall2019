package topic02.inheritance.usinginheritance;


public class SalariedEmployee extends SalesEmployee{

    //everything in SalesEmployee (Attributes and Methods)
    //will be also attribute and methods of SalariedEmployee
    
    private double baseSalary; 
    
    
    public SalariedEmployee(String firstName, String lastName, String id, 
            double sales, double commission, double bs) {
        super(firstName, lastName, id, sales, commission);
        setBaseSalary(bs);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double totalSalary(){
        return baseSalary+super.totalSalary();
    }
    
    @Override
    public String toString(){
        return String.format("salaried and %s\n" 
                + "base salary: %.2f",
                super.toString(), baseSalary);
    }
    
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
