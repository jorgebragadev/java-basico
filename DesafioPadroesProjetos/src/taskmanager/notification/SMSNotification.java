package taskmanager.notification;


public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS notification.");
    }
}
