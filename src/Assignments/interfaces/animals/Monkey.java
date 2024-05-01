package Assignments.interfaces.animals;

public class Monkey implements Climbable{
    @Override
    public void climb() {
        System.out.println("Monkeys can climb trees.");
    }

    @Override
    public void feed() {
        System.out.println("Monkeys eat fruits.");
    }

    @Override
    public void makeSound() {
        System.out.println("Monkeys can make various sounds.");
    }
}
