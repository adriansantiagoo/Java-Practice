package OOP_concepts.TaskTracker_system;

import java.util.ArrayList;

public class Manager {
    private ArrayList<Task> list = new ArrayList<>();

    public boolean containsTask(Task task){
        for (Task currentTask : this.list){
            if (task.getId() == currentTask.getId()) return true;
        }
        return false;
    }

    public void addTask(Task task){
        if (containsTask(task)) return;
        this.list.add(task);
    }

    public void printTasks(){
        for (Task task : this.list){
            System.out.println(task.toString());
        }
    }
}
