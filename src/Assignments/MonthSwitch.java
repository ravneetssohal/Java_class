package Assignments;

import java.util.Scanner;

public class MonthSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month in numerical format: ");
        int month = scanner.nextInt();

        if(month >= 1 && month <= 12) {
            switch (month) {
                case 1:
                    System.out.println(month + "st month is January.");
                    break;
                case 2:
                    System.out.println(month + "nd month is February.");
                    break;
                case 3:
                    System.out.println(month + "rd month is March.");
                    break;
                case 4:
                    System.out.println(month + "th month is April.");
                    break;
                case 5:
                    System.out.println(month + "th month is May.");
                    break;
                case 6:
                    System.out.println(month + "th month is June.");
                    break;
                case 7:
                    System.out.println(month + "th month is July.");
                    break;
                case 8:
                    System.out.println(month + "th month is August.");
                    break;
                case 9:
                    System.out.println(month + "th month is September.");
                    break;
                case 10:
                    System.out.println(month + "th month is October.");
                    break;
                case 11:
                    System.out.println(month + "th month is November.");
                    break;
                case 12:
                    System.out.println(month + "th month is December.");
                    break;
            }
        }else{
            System.out.println("Enter between 1 and 12. Try again.");
        }
        scanner.close();
    }
}
