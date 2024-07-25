package taskmanager.factory;

import taskmanager.notification.EmailNotification;
import taskmanager.notification.Notification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
