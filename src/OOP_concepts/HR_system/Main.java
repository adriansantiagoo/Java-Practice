package OOP_concepts.HR_system;

public class Main {
    public static void main(String[] args){

        Employee employee1 = new Employee("Carlos", 100000);
        Employee employee2 = new Employee("Fernando", 60000);

        String info1 = employee1.getEmployeeDetails();
        String info2 = employee2.getEmployeeDetails();
        double bonus1 = Employee.calculateHolidayBonus(employee1.salary);
        double bonus2 = Employee.calculateHolidayBonus(employee2.salary);

        System.out.println(info1);
        System.out.println(info2);
        System.out.printf("The holiday bonus of the employee with ID 1 is $%.2f.\n", bonus1);
        System.out.printf("The holiday bonus of the employee with ID 2 is $%.2f.\n", bonus2);

        int totalEmployees = Employee.getTotalEmployees();
        System.out.println("The total employees is " + totalEmployees);
    }
}
