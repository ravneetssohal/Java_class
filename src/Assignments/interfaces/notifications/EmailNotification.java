package Assignments.interfaces.notifications;

public interface EmailNotification extends NotificationSender {
    void setRecipients(String recipients);
    void sendEmailNotification();
}
