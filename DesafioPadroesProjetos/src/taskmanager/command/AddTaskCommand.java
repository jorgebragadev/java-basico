package taskmanager.command;

import taskmanager.model.Task;

public class AddTaskCommand implements Command {
    private Task task;

    public AddTaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        // Add task logic here
        System.out.println("Task added: " + task.getTitle());
    }
}
