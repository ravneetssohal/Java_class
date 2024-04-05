package Assignments;

import java.util.Scanner;

public class WeekSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String week = scanner.next();
        week = week.toLowerCase();

        if(week.equals("monday") || week.equals("tuesday") || week.equals("wednesday") || week.equals("thursday") || week.equals("friday") || week.equals("saturday") || week.equals("sunday")) {
            switch (week) {
                case "monday":
                    System.out.println(week + " is a weekday.");
                    break;
                case "tuesday":
                    System.out.println(week + " is a weekday.");
                    break;
                case "wednesday":
                    System.out.println(week + " is a weekday.");
                    break;
                case "thursday":
                    System.out.println(week + " is a weekday.");
                    break;
                case "friday":
                    System.out.println(week + " is a weekday.");
                    break;
                case "saturday":
                    System.out.println(week + " is a weekend.");
                    break;
                case "sunday":
                    System.out.println(week + " is a weekend.");
                    break;
            }
        }else{
            System.out.println("Please enter a day of the week only. Try again.");
        }
        scanner.close();
    }
}
