package Assignments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find it's factorial: ");
        double n = scanner.nextDouble();
        double number = 1;
        double factorial = 1;
        while(number <= n){
            factorial *= number;
            number++;
        }
        System.out.println("Factorial of " + n + " is " + factorial);
        scanner.close();
    }
}
