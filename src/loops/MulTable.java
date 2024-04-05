package loops;

import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want multiplication table for: ");
        int n = scanner.nextInt();

        int counter = 1;
        while(counter <= 10){
            System.out.println(n + " x " + counter + " = " + n * counter);
            counter++;
        }
        scanner.close();
    }
}
