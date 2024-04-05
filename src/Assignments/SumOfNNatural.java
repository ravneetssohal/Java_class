package Assignments;

import java.util.Scanner;

public class SumOfNNatural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number and the program will give you the sum of natural numbers till that number: ");
        double number = scanner.nextDouble();
        double n = 0;
        double sum = 0;
        while(n <= number){
            sum += n;
            n++;
        }
        System.out.println("Sum of the first " + number + " natural numbers is " + sum);
        scanner.close();
    }
}
