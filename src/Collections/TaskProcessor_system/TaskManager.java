package Collections.TaskProcessor_system;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class TaskManager {
    Queue<Task> taskQueue = new PriorityQueue<>();
    Stack<Task> undoTask = new Stack<>();
    Stack<Task> redoTask = new Stack<>();
    Stack<Task> failedTasks = new Stack<>();
    private Task currentTask;

    public void addTask(Task task){
        if (!redoTask.isEmpty()){
            redoTask.clear();
        }
        taskQueue.add(task);
    }

    public void redoTask(){
        if (redoTask.isEmpty()) return;
        Task t = redoTask.pop();
        t.setStatus(TaskStatus.DONE);
        undoTask.push(t);
        currentTask = t;
    }

    public void undoTask(){
        if (undoTask.isEmpty()) return;
        Task t = undoTask.pop();
        t.setStatus(TaskStatus.TODO);
        redoTask.push(t);
        currentTask = t;
    }

    public void runNextTask(){
        if (taskQueue.isEmpty()) return;

        Task t = taskQueue.poll();
        t.setStatus(TaskStatus.DONE);
        undoTask.push(t);
        currentTask = t;
    }

    public void failCurrentTask(){
        if (currentTask == null) return;

        currentTask.setStatus(TaskStatus.TODO);
        failedTasks.push(currentTask);

        // remove from history if it was pushed there
        if (!undoTask.isEmpty() && undoTask.peek().equals(currentTask)) {
            undoTask.pop();
        }

        currentTask = null; // clean up active reference
    }

    public void retryFailedTask(){
        if (failedTasks.isEmpty()) return;
        Task t = failedTasks.pop();
        addTask(t);
    }
}
