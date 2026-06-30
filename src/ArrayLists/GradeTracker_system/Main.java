package ArrayLists.GradeTracker_system;

public class Main {
    public static void main(String[] args){
        GradeTracker gradeTracker = new GradeTracker();

        gradeTracker.addGrade(6.5);
        gradeTracker.addGrade(7.5);

        System.out.println(gradeTracker.calculateAverage());

        gradeTracker.addGrade(10);

        System.out.println(gradeTracker.getHighestGrade());
    }
}
