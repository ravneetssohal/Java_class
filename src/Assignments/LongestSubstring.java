package Assignments;

import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word you want to check: ");
        String word = scanner.next();

        int max = 1;
        int maxLength = 1;
        for (int i = 0; i < word.length() - 1; i++) {
            if(word.charAt(i) != word.charAt(i + 1)){
                max++;
                if(i == word.length() - 2){
                    if(max > maxLength){
                        maxLength = max;
                    }
                }
            }else if(word.charAt(i) == word.charAt(i + 1)){
                if(max > maxLength){
                    maxLength = max;
                }
                max = 1;
            }
        }

        System.out.println("Length of the longest substring without repeating characters is " + maxLength);
    }
}
