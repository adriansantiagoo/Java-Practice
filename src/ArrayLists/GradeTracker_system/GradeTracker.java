package ArrayLists.GradeTracker_system;

import java.util.ArrayList;

public class GradeTracker {
    private ArrayList<Double> list;

    public GradeTracker(){
        this.list = new ArrayList<>();
    }

    public ArrayList<Double> getList() {
        return list;
    }

    public boolean isEmpty(){
        return this.list.isEmpty();
    }

    public void addGrade(double grade){
        if (grade < 0 || grade > 100){
            System.out.println("Invalid grade!");
        }
        this.list.add(grade);
    }

    public boolean removeGrade(double grade) {
        if (isEmpty()) {
            System.out.println("The list is empty!");
            return false;
        }

        // Capture the boolean result that Java naturally returns
        return this.list.remove(grade);
    }

    public double calculateAverage(){
        if (isEmpty()){
            System.out.println("The list is empty!");
            return -1;
        }

        double totalSum = 0;
        int quantityOfGrade = this.list.size();

        for (double grade : this.list){
            totalSum += grade;
        }

        return totalSum / quantityOfGrade;
    }

    public double getHighestGrade(){
        if (isEmpty()){
            System.out.println("This list is empty!");
            return -1;
        }

        double currentHighest = this.list.getFirst();

        for (double grade : this.list){
            if (grade > currentHighest){
                currentHighest = grade;
            }
        }

        return currentHighest;
    }
}
