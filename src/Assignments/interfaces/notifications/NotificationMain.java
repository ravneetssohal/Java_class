package Assignments.interfaces.notifications;

import java.util.Scanner;

public class NotificationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailNotification email = new EmailNotificationSender();

        System.out.print("Enter the recipient's email address: ");
        String recipient = scanner.next();
        scanner.nextLine();
        email.setRecipients(recipient);

        System.out.print("Enter your message: ");
        String message = scanner.nextLine();
        email.sendNotification(message);

        System.out.println();
        email.sendEmailNotification();

        System.out.println("--------------------------------------");

        SMSNotification sms = new SMSNotificationSender();

        System.out.print("Enter the recipient's phone number: ");
        String phone = scanner.next();
        scanner.nextLine();
        sms.setPhoneNumber(phone);

        System.out.print("Enter your message: ");
        String message1 = scanner.nextLine();
        sms.sendNotification(message1);

        System.out.println();
        sms.sendSmsNotification();

        System.out.println("--------------------------------------");

        PushNotification push = new PushNotificationSender();

        System.out.print("Enter your message: ");
        String message2 = scanner.nextLine();
        push.sendNotification(message2);

        System.out.println();
        push.sendPushNotification();

        scanner.close();
    }
}
