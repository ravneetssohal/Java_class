package Assignments.interfaces.notifications;

public interface SMSNotification extends NotificationSender{
    void setPhoneNumber(String phoneNumber);
    void sendSmsNotification();
}
