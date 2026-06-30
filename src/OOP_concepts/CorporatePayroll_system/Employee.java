package OOP_concepts.CorporatePayroll_system;

public class Employee extends Person{
    protected double baseSalary;

    Employee(String name, double baseSalary){
        super(name);
        this.baseSalary = baseSalary;
    }

    public double calculatePayout(){
        return baseSalary;
    }
}
