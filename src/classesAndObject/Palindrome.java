package classesAndObject;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        String cleanstr = str.replaceAll("[^a-z,A-Z,0-9]","").toLowerCase();
        char[] array = cleanstr.toCharArray();
        char[] reversed = new char[array.length];

        for (int i = 0; i < array.length; i++) {
            reversed[array.length - 1 - i] = array[i];
        }

        String reversedstr = new String(reversed);


        return cleanstr.equals(reversedstr);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println(word + " is a Palindrome? " + isPalindrome(word));
    }
}
