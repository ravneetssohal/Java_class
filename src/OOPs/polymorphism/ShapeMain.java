package OOPs.polymorphism;

public class ShapeMain {
    public static void main(String[] args) {
        Shape circle = new Circle(50);
        circle.getArea();

        Shape rectangle = new Rectangle(3,4);
        rectangle.getArea();

        Shape obj = new Shape();
        obj.getArea();


    }
}
