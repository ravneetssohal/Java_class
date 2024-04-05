package Assignments;

import java.util.Objects;
import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char input = scanner.next().charAt(0);

        if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' || input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U'){
            System.out.println(input + " Character is a vowel.");
        }else{
            System.out.println(input + " Character is a consonant.");
        }

        scanner.close();
    }
}
