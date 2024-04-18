package Assignments;

import java.util.Scanner;

public class ReverseSentence {
    public String[] reverse(String sentence){
        String[] sentenceArray = sentence.split(" ");

        String temp;
        int end = sentenceArray.length - 1;
        for (int start = 0; start <= end; start++) {
            temp = sentenceArray[start];
            sentenceArray[start] = sentenceArray[end];
            sentenceArray[end] = temp;
            end--;
        }

        return sentenceArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence you want to reverse: ");
        String sentence = scanner.nextLine();

        ReverseSentence reverseSentence = new ReverseSentence();

        for (int i = 0; i < reverseSentence.reverse(sentence).length; i++) {
            System.out.print(reverseSentence.reverse(sentence)[i] + " ");
        }
    }
}
