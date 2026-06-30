package OOP_concepts.CorporatePayroll_system;

public class Main {
    public static void main(String[] args){
        Employee employee = new Employee("Alice", 5000);
        Manager manager = new Manager("Bob", 8000, 2000);

        System.out.printf("The total payout of %s is $%.2f.\n", employee.name, employee.calculatePayout());
        System.out.printf("The total payout of %s is $%.2f.\n", manager.name, manager.calculatePayout());
    }
}
