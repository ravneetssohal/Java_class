package Assignments.interfaces.animals;

public class Lion implements Climbable{
    @Override
    public void climb() {
        System.out.println("Lion can climb mountains.");
    }

    @Override
    public void feed() {
        System.out.println("Lion eats Zebra.");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion roars.");
    }
}
