package Collections.TaskProcessor_system;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager(3);

        System.out.println("=== Phase 3 Execution Simulation ===");

        manager.addTask(new Task("Database Backup", TaskPriority.HIGH));
        manager.addTask(new Task("Process Payroll", TaskPriority.HIGH));
        manager.addTask(new Task("Send Newsletter", TaskPriority.LOW));
        manager.addTask(new Task("Log Analysis", TaskPriority.MEDIUM));
        manager.addTask(new Task("Cleanup Cache", TaskPriority.LOW));

        System.out.println("Initial Queue order: " + manager.getTaskQueue());
        System.out.println();

        for (int i = 0; i < 5; i++) {
            manager.runNextTask();
            System.out.println("Executed: " + manager.getCurrentTask().getName() + " | Current Undo History Size: " + manager.getUndoTask().size());
        }

        System.out.println();
        // verification A: the undo history should be capped at 3
        System.out.println("Current Undo Stack: " + manager.getUndoTask());
        System.out.println("-> Verify cap size is <= 3: " + (manager.getUndoTask().size() <= 3));

        // verification B: the oldest task (Payroll/Database Backup) should have been evicted, but most recent remain
        System.out.println("-> Database Backup still in undo stack? " + manager.getUndoTask().stream().anyMatch(t -> t.getName().equals("Database Backup")));

        // verification C: global audit log must still retain all 5 executions
        System.out.println();
        System.out.println("Global Audit Log (Total Processed History):");
        manager.getGlobalAuditLog().forEach(task -> System.out.println(" - " + task));
    }
}
