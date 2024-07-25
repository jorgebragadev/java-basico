package taskmanager.strategy;


import taskmanager.model.Task;

public class SimpleSchedulingStrategy implements TaskSchedulingStrategy {
    @Override
    public void schedule(Task task) {
        System.out.println("Scheduling task: " + task.getTitle() + " with simple strategy.");
    }
}
