package Assignments;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float radius = scanner.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("The area of area of the circle is " + area);
        scanner.close();
    }
}
