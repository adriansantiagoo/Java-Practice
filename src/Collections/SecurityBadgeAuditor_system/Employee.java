package Collections.SecurityBadgeAuditor_system;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // used for change how the .equals method works
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // checking if both objects are in the same memory
        if (o == null || getClass() != o.getClass()) return false; // checking if the type of objects are the same
        Employee employee = (Employee) o;
        return this.id == employee.id; // checking if their ids are the same
    }

    // return the "fingerprint" of the object
    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
