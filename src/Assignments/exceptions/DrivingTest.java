package Assignments.exceptions;

import java.util.Scanner;

class InvalidAgeException extends Throwable{
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class DrivingTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age to check your eligibility: ");
        try {
            int age = sc.nextInt();
            if (age >= 18 && age <= 100) {
                System.out.println("You are eligible to take the driving test.");
            } else {
                throw new InvalidAgeException("Your age is invalid for the driving test.");
            }

        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Something went wrong!");
        }

    }
}
