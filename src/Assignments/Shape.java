package Assignments;

import java.util.Scanner;

public class Shape {

    double area;
    public double area(double radius){
        //area of circle
        area = 2 * 3.14 * radius;
        return area;
    }
    public double area(double length, double width){
        //area of rectangle
        area = length * width;
        return area;
    }
    public double area(int length){
        //area of square
        area = 2 * length;
        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("Area of the circle is " + shape.area(radius));

        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Area of the rectangle is " + shape.area(length, width));

        System.out.println("Enter the length of the square: ");
        int lengthSqaure = scanner.nextInt();
        System.out.println("Area of the square is " + shape.area(lengthSqaure));

    }
}
