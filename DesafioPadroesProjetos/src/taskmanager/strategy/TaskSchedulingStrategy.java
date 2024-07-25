package taskmanager.strategy;

import taskmanager.model.Task;

public interface TaskSchedulingStrategy {
    void schedule(Task task);
}
