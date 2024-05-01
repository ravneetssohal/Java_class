package Assignments.interfaces.animals;

public class Penguin implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Penguins can swim.");
    }

    @Override
    public void feed() {
        System.out.println("Penguins eats fish.");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin squawks.");
    }
}
