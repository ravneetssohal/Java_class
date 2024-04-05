package Assignments;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your score to find your grade: ");
        int score = scanner.nextInt();

        if(score >= 90 && score <= 100){
            System.out.println("Your grade is A.");
        }else if(score >= 80 && score <= 89){
            System.out.println("Your grade is B.");
        }else if(score >= 70 && score <= 79){
            System.out.println("Your grade is C.");
        }else if(score >= 60 && score <= 69){
            System.out.println("Your grade is D.");
        }else if(score >= 0 && score <= 59){
            System.out.println("Your grade is F. You have failed.");
        }else{
            System.out.println("Your score should be between 0 and 100. Please try again.");
        }
        scanner.close();
    }
}
