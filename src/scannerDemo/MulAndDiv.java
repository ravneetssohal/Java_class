package scannerDemo;

import java.util.Scanner;

public class MulAndDiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        float x = scanner.nextFloat();

        System.out.println("Enter the value of y: ");
        float y = scanner.nextFloat();

        float mul = x * y;
        float div = x / y;
        System.out.println("The Multiplication of x and y is " + mul);
        System.out.println("The Division of x and y is " + div);
    }
}
