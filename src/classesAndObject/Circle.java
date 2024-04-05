package classesAndObject;

import java.util.Scanner;

public class Circle {
    public void circle(float radius){
        float area = 3.14f * radius * radius;
        float circumference = 2f * 3.14f * radius;
        System.out.println("Area of the circle is " + area);
        System.out.println("Circumference of the circle is " + circumference);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float rcircle = scanner.nextFloat();

        circle.circle(rcircle);
        scanner.close();
    }
}
