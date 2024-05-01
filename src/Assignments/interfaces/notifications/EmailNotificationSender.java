package Assignments.interfaces.notifications;

public class EmailNotificationSender implements EmailNotification{
    String recipients;
    String message;


    @Override
    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    @Override
    public void sendNotification(String message) {
        this.message = message;
    }

    @Override
    public void sendEmailNotification() {
        System.out.println("Recipient: " + recipients);
        System.out.println("Message: " + message);
        System.out.println("The email was sent.");

    }


}
