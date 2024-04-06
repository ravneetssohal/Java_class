package classesAndObject;

public class Animal {

    String name;
    String color;
    int weight;

    Animal(){
        name = "Lion";
        color = "Brown";
        weight = 250;
    }

    public void eat(){
        System.out.println("Weight of the " + name + " is "+ weight + "lbs");
        System.out.println(name + " is eating.");
    }

    public void makeSounds(){
        System.out.println(name + " is making sounds.");
    }

    public void walk(){
        System.out.println(name + " of " + color + " is walking.");
    }


}
