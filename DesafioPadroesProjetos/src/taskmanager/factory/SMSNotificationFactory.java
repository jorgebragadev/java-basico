package taskmanager.factory;

import taskmanager.notification.Notification;
import taskmanager.notification.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
