package classesAndObject;

import java.util.Scanner;
import java.util.SortedMap;

public class Rectangle {
    public void rectangle(int width, int length){
        int area = width * length;
        int perimeter = 2 * (width + length);
        System.out.println("Area of the rectangle is " + area);
        System.out.println("Perimeter of the rectangle is " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        int rwidth = scanner.nextInt();
        System.out.print("Enter the length of the rectangle: ");
        int rlength = scanner.nextInt();

        rectangle.rectangle(rwidth, rlength);
    }
}
