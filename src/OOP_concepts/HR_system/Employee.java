package OOP_concepts.HR_system;

public class Employee {
    static int totalEmployees;
    String name;
    double salary;
    int id;

    static double calculateHolidayBonus(double salary){
        return 0.1 * salary;
    }

    Employee(String name, double salary){
        totalEmployees++;
        this.name = name;
        this.salary = salary;
        id = totalEmployees;
    }

    String getEmployeeDetails(){
        return "ID: " + id + " | Name: " + name + " | Salary: " + salary;
    }

    static int getTotalEmployees(){
        return totalEmployees;
    }
}
