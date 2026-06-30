package OOP_concepts.CorporatePayroll_system;

public class Manager extends Employee{
    private double bonus;

    Manager(String name, double baseSalary, double bonus){
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePayout(){
        return super.calculatePayout() + this.bonus;
    }
}
