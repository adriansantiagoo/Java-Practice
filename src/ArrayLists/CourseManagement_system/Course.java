package ArrayLists.CourseManagement_system;

import java.util.ArrayList;

public class Course {
    private String name;
    private int capacity;
    private ArrayList<Integer> list;

    public Course(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.list = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Integer> getList() {
        return new ArrayList<>(this.list);
    }

    public boolean isEmpty(){
        return this.list.isEmpty();
    }

    public void enrollStudent(int id){
        if (this.list.size() == capacity){
            System.out.println("The course is already full!");
            return;
        }
        if (this.list.contains(id)){
            System.out.println("The id is already in the course!");
            return;
        }
        this.list.add(id);
    }
    public boolean dropStudent(int id){
        if (isEmpty()) {
            System.out.println("The course is empty!");
            return false;
        }
        if (!this.list.contains(id)){
            System.out.println("This id is not in the course!");
            return false;
        }
        this.list.remove(Integer.valueOf(id));
        return true;
    }
}
