package OOP_concepts.TaskTracker_system;

public class Main {
    public static void main(String[] args){
        Manager manager = new Manager();

        Task task1 = new Task("Learn Git");
        Task task2 = new Task("Study Algorithms");
        Task task3 = new Task("Study English");

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);

        for (Task task : manager.getList()){
            System.out.println(task.toString());
        }
    }
}
