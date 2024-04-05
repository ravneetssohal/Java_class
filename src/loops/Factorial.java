package loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want factorial for: ");
        int n = scanner.nextInt();

        int counter = 1;
        int mul = 1;
        while(counter <= n){
            mul = mul * counter;
            counter++;
        }
        System.out.println("Factorial of "+ n + " is " + mul + ".");


        scanner.close();
    }
}
