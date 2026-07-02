package OOP_concepts.TaskTracker_system;

public class Task {
    private int id;
    private String title;
    private TaskStatus status;
    static int counterIds = 0;

    public Task(String title) {
        counterIds++;
        this.id = counterIds;
        this.title = title;
        this.status = TaskStatus.TODO;
    }

    public TaskStatus getStatus() {
        return this.status;
    }

    @Override
    public String toString(){
        return "ID: " + this.id + " | Title: " + this.title + " | Status: " + this.status;
    }

    public void setStatus(TaskStatus newStatus) {
        this.status = newStatus;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
