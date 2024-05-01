package Assignments.interfaces.notifications;

public class PushNotificationSender implements PushNotification{
    String message;

    @Override
    public void sendNotification(String message) {
        this.message = message;
    }

    @Override
    public void sendPushNotification() {
        System.out.println("Message: " + message);
        System.out.println("Push Notification was sent to the device.");
    }


}
