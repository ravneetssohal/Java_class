package classesAndObject;

import java.util.Scanner;

public class Calculator {

    public void add(float number1, float number2){
        float sum = number1 + number2;
        System.out.println(sum);
    }
    public void sub(float number1, float number2){
        float sub = number1 - number2;
        System.out.println(sub);
    }
    public void mul(float number1, float number2){
        float mul = number1 * number2;
        System.out.println(mul);
    }
    public void div(float number1, float number2){
        float div = number1 / number2;
        System.out.println(div);
    }
    public void mod(float number1, float number2){
        float mod = number1 % number2;
        System.out.println(mod);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        char runAgain = 'y';

        do {
            System.out.println("Welcome to my Calculator");
            System.out.println("1. Press 1 for addition.");
            System.out.println("2. Press 2 for subtraction.");
            System.out.println("3. Press 3 for multiplication.");
            System.out.println("4. Press 4 for division.");
            System.out.println("5. Press 5 for modulus.");
            System.out.println("6. Press 0 to exit.");

            System.out.print("Please enter your input: ");
            int input = scanner.nextInt();

            if (input >= 1 && input <= 5) {
                System.out.print("Enter a number: ");
                float number1 = scanner.nextFloat();
                System.out.print("Enter second number: ");
                float number2 = scanner.nextFloat();
                switch (input){
                    case 1:
                        calculator.add(number1, number2);
                        break;
                    case 2:
                        calculator.sub(number1, number2);
                        break;
                    case 3:
                        calculator.mul(number1, number2);
                        break;
                    case 4:
                        calculator.div(number1, number2);
                        break;
                    case 5:
                        calculator.mod(number1, number2);
                        break;
                }
            } else if (input == 0) {
                break;
            } else {
                System.out.println("Invalid input. Please only choose one of the following options.");
                continue;
            }

            do {
                System.out.println("Do you want to do another calculation? Type (y/n)");
                runAgain = scanner.next().charAt(0);

                if(runAgain == 'y' || runAgain == 'n'){
                    break;
                }else{
                    System.out.println("Invalid input!");
                }
            }while(true);
        }while(runAgain == 'y');
        System.out.println("Thank you for using my calculator.");
        scanner.close();
    }
}
