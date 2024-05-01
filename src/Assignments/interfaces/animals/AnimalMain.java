package Assignments.interfaces.animals;

public class AnimalMain {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.feed();
        lion.makeSound();
        lion.climb();
        System.out.println("----------------------------");

        Monkey monkey = new Monkey();
        monkey.feed();
        monkey.makeSound();
        monkey.climb();
        System.out.println("----------------------------");

        Penguin penguin =new Penguin();
        penguin.feed();
        penguin.makeSound();
        penguin.swim();
    }
}
