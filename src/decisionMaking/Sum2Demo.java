package decisionMaking;

import java.util.Scanner;

public class Sum2Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int counter = 1;
        int sum = 0;
        while(counter <= n){
            System.out.println(counter);
            sum = sum + counter;
            counter++;
        }
        System.out.println("Sum of all the numbers is " + sum + ".");
    }
}
