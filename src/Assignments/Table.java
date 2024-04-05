package Assignments;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print it's table: ");
        int number = scanner.nextInt();
        int n = 1;

        while(n <= 10){
            System.out.println(number + " x " + n + " = " + number * n);
            n++;
        }
        scanner.close();

    }
}
