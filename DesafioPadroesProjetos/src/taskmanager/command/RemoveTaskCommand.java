package taskmanager.command;



import taskmanager.manager.TaskManager;
import taskmanager.model.Task;

public class RemoveTaskCommand implements Command {
    private Task task;
    private TaskManager taskManager;

    public RemoveTaskCommand(Task task) {
        this.task = task;
        this.taskManager = TaskManager.getInstance();
    }

    @Override
    public void execute() {
        taskManager.removeTask(task);
        System.out.println("Task removed: " + task.getTitle());
    }
}
