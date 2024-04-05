package scannerDemo;

import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name: ");

        String name = scanner.nextLine();
        System.out.println(name);

        scanner.close();

    }
}
