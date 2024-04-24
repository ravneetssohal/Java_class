package OOPs.polymorphism;

public class Circle extends Shape{
    private double radius;
    private double area;
    private final double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void getArea(){
        area = pi * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
