package Assignments;

import java.util.Scanner;

public class NumberOfVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word you want to check: ");
        String word = scanner.next();

        word = word.toLowerCase();
        int vowels = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u'){
                vowels++;
            }
        }

        System.out.println("Number of vowels:" + vowels + "\nNumber of consonants: " + (word.length() - vowels));
    }
}
