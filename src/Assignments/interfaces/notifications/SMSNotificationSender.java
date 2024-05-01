package Assignments.interfaces.notifications;

public class SMSNotificationSender implements SMSNotification{
    String phoneNumber;
    String message;

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification(String message) {
        this.message = message;
    }

    @Override
    public void sendSmsNotification() {
        System.out.println("Recipient: " + phoneNumber);
        System.out.println("Message: " + message);
        System.out.println("The SMS was sent.");
    }


}
