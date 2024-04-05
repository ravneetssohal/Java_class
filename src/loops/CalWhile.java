package loops;

import java.util.Scanner;

public class CalWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = 'y';
        while(c == 'y'){
            System.out.println("Welcome to my Calculator");
            System.out.println("1. Press 1 for addition.");
            System.out.println("2. Press 2 for subtraction.");
            System.out.println("3. Press 3 for multiplication.");
            System.out.println("4. Press 4 for division.");
            System.out.println("5. Press 5 for modulus.");
            System.out.println("6. Press 0 to exit.");

            System.out.println("Please enter your input: ");
            int input = scanner.nextInt();

            if (input >= 1 && input <= 5) {
                System.out.println("Enter the first number: ");
                float number1 = scanner.nextFloat();
                System.out.println("Enter the second number: ");
                float number2 = scanner.nextFloat();

                switch (input) {
                    case 1:
                        float sum = number1 + number2;
                        System.out.println("Sum of the two numbers is " + sum);
                        break;
                    case 2:
                        float sub = number1 - number2;
                        System.out.println("Subtraction of the two numbers is " + sub);
                        break;
                    case 3:
                        float mul = number1 * number2;
                        System.out.println("Multiplication of the two numbers is " + mul);
                        break;
                    case 4:
                        float div = number1 / number2;
                        System.out.println("Division of the two numbers is " + div);
                        break;
                    case 5:
                        float mod = number1 % number2;
                        System.out.println("Modulus of the two numbers is " + mod);
                        break;
                    default:
                        System.out.println("Thank you for using my calculator.");
                        break;


                }
            } else {
                System.out.println("Thank you for using my calculator.");
            }
            System.out.println("Do you want to do another calculation? (Type Y/N)");
            char ch = scanner.next().charAt(0);
            c = ch;

        }
        System.out.println("Thank you for using my calculator.");
        scanner.close();

    }
}
