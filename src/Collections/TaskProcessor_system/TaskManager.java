package Collections.TaskProcessor_system;

import java.util.*;

public class TaskManager {
    Queue<Task> taskQueue = new PriorityQueue<>();
    Stack<Task> undoTask = new Stack<>();
    Stack<Task> redoTask = new Stack<>();
    Stack<Task> failedTasks = new Stack<>();
    ArrayList<Task> globalAuditLog = new ArrayList<>();

    private final int maxHistoryCapacity;
    private Task currentTask;

    public TaskManager(int maxHistoryCapacity) {
        this.maxHistoryCapacity = maxHistoryCapacity;
    }

    public void addTask(Task task){
        if (!redoTask.isEmpty()){
            redoTask.clear();
        }
        taskQueue.add(task);
    }

    public void redoTask(){
        if (redoTask.isEmpty()) return;

        Task t = redoTask.pop();
        processCompletedTask(t);
    }

    public void undoTask(){
        if (undoTask.isEmpty()) return;

        Task t = undoTask.pop();
        t.setStatus(TaskStatus.TODO);
        redoTask.push(t);
        currentTask = t;
        globalAuditLog.remove(t);

    }

    public void runNextTask(){
        if (taskQueue.isEmpty()) return;

        Task t = taskQueue.poll();
        processCompletedTask(t);
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

    private void processCompletedTask(Task t) {
        t.setStatus(TaskStatus.DONE);

        if (undoTask.size() >= maxHistoryCapacity) {
            undoTask.removeFirst();
        }

        undoTask.push(t);
        globalAuditLog.add(t);
        currentTask = t;
    }

    public Queue<Task> getTaskQueue() { return taskQueue; }
    public Stack<Task> getUndoTask() { return undoTask; }
    public Stack<Task> getRedoTask() { return redoTask; }
    public Stack<Task> getFailedTasks() { return failedTasks; }
    public ArrayList<Task> getGlobalAuditLog() { return globalAuditLog; }
    public Task getCurrentTask() { return currentTask; }
}
