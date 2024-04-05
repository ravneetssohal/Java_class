package Assignments;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the side of the square: ");
        int side = scanner.nextInt();
        int area = side * side;
        System.out.println("The area of area of the square is " + area);
        scanner.close();
    }
}
