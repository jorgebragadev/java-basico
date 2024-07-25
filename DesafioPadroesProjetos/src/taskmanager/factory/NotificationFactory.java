package taskmanager.factory;

import taskmanager.notification.Notification;

public abstract class NotificationFactory {
    public abstract Notification createNotification();

    public static NotificationFactory getFactory(String type) {
        if ("email".equalsIgnoreCase(type)) {
            return new EmailNotificationFactory();
        } else if ("sms".equalsIgnoreCase(type)) {
            return new SMSNotificationFactory();
        }
        return null;
    }
}
