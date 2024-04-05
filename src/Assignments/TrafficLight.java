package Assignments;

import java.util.Objects;
import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a color from the following choices:\nRed\nYellow\nGreen");
        String input = scanner.next();
        input = input.toLowerCase();

        if(Objects.equals(input, "red") || Objects.equals(input, "yellow") || Objects.equals(input, "green")){
            switch (input){
                case "red":
                    System.out.println("Stop");
                    break;
                case "yellow":
                    System.out.println("Prepare to Stop");
                    break;
                case "green":
                    System.out.println("Go");
                    break;
                default:
                    System.out.println("The color does not match the three given choices.");
                    break;
            }

        }else{
            System.out.println("The color does not match the three given choices.");
        }

        scanner.close();
    }
}
