package Collections.TaskProcessor_system;

public class Task {
    private String name;
    private TaskStatus status;

    public Task(String name){
        this.name = name;
        this.status = TaskStatus.TODO;
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
}
