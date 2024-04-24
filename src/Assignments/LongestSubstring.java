package Assignments;

import java.util.Scanner;

public class LongestSubstring {

    static public boolean duplicate(String subword){
        for (int i = 0; i < subword.length(); i++) {
            for (int j = i + 1; j < subword.length(); j++) {
                if (subword.charAt(i) == subword.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word you want to check: ");
        String word = scanner.next();
        int max = 0;
        int maxLength = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if(!duplicate(word.substring(i,j))){
                   max = j - i;
                   if(max > maxLength){
                       maxLength = max;
                   }
                }
            }
        }


        /*int max = 1;
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
        }*/

        System.out.println("Length of the longest substring without repeating characters is " + maxLength);
    }
}
