package taskmanager.model;

import java.util.Date;
import java.util.Observable;
import java.util.Observer;

public class Task extends Observable implements Observer {
    private String title;
    private String description;
    private Date dueDate;

    public Task(String title, String description, Date dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Notification for task: " + title + " - " + arg);
    }

    // Use this method to notify observers
    public void notifyObservers(String message) {
        setChanged();
        super.notifyObservers(message);
    }
}
