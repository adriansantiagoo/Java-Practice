package Collections.SecurityBadgeAuditor_system;

import java.util.HashSet;

public class SecurityManager {
    private HashSet<Employee> attendanceSet = new HashSet<>();

    public void logEmployee(Employee emp) {
        attendanceSet.add(emp);
    }

    public boolean containsEmployee(Employee emp){
        return attendanceSet.contains(emp);
    }
}
