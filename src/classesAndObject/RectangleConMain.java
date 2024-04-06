package classesAndObject;

import java.util.Scanner;

public class RectangleConMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        RectangleContructor rectangleContructor = new RectangleContructor(length,width);

        //RectangleContructor rectangle = new RectangleContructor(length);
        System.out.println("Area of the rectangle is " + rectangleContructor.area());
        System.out.println("Parameter of the rectangle is " + rectangleContructor.parameter());
    }
}
