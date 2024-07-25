

import taskmanager.command.Command;
import taskmanager.command.AddTaskCommand;
import taskmanager.factory.NotificationFactory;
import taskmanager.notification.Notification;
import taskmanager.strategy.SimpleSchedulingStrategy;
import taskmanager.strategy.TaskSchedulingStrategy;
import taskmanager.model.Task;
import taskmanager.manager.TaskManager;

import java.util.Date;

public class TaskManagerUI {
    public static void main(String[] args) {
        TaskManager taskManager = TaskManager.getInstance();
        Task task = new Task("My Task", "This is a task description.", new Date());
        
        Command addTaskCommand = new AddTaskCommand(task);
        addTaskCommand.execute();
        
        NotificationFactory notificationFactory = NotificationFactory.getFactory("email");
        if (notificationFactory != null) {
            Notification notification = notificationFactory.createNotification();
            notification.notifyUser();
        } else {
            System.out.println("NotificationFactory type not recognized.");
        }
        
        TaskSchedulingStrategy schedulingStrategy = new SimpleSchedulingStrategy();
        schedulingStrategy.schedule(task);
        
        // Further UI interactions can be implemented here
    }
}
