package OOPs.polymorphism;

public class Rectangle extends Shape{
    private double length;
    private double breadth;

    private double area;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void getArea() {
        area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}
