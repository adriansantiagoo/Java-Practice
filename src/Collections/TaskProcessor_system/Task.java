package Collections.TaskProcessor_system;

public class Task implements Comparable<Task> {
    private String name;
    private TaskStatus status;
    private TaskPriority priority;

    public Task(String name, TaskPriority priority) {
        this.name = name;
        this.status = TaskStatus.TODO;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return java.util.Objects.equals(this.name, task.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Status: " + status;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        // reversing the natural comparison forces higher ordinals (HIGH)
        // to the front of Java's Min-Heap PriorityQueue
        return Integer.compare(other.getPriority().ordinal(), this.getPriority().ordinal());
    }
}
