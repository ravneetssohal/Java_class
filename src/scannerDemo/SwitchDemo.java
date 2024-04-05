package scannerDemo;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();

        switch(input){
            case 1:
                System.out.println("Turn on the fan.");
                break;
            case 2:
                System.out.println("Turn on the red bulb.");
                break;
            case 3:
                System.out.println("Turn on the green bulb.");
                break;
            default:
                System.out.println("Nothing Found.");
        }
        scanner.close();
    }
}
