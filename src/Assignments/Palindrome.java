package Assignments;

import java.util.Scanner;

public class Palindrome {

    public boolean palindromeCheck(String word){
        String reverseWord;
        char[] wordArray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordArray[i] = word.charAt(i);
        }

        char temp;
        int end = wordArray.length - 1;
        for (int start = 0; start <= end; start++) {
            temp = wordArray[start];
            wordArray[start] = wordArray[end];
            wordArray[end] = temp;
            end--;
        }
        reverseWord = new String(wordArray);

        return reverseWord.equals(word);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word you want to check: ");
        String word = scanner.next();

        Palindrome palindrome = new Palindrome();
        if (palindrome.palindromeCheck(word)) {
            System.out.println("The word you provided is a Palindrome.");
        }else {
            System.out.println("The word you provided is not a Palindrome.");
        }


    }
}
