package Assignments.vehicleInheritance;

public class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void start(){
        System.out.println("The vehicle has started.");
    }
    public void stop(){
        System.out.println("The vehicle has been turned off.");
    }
    public void displayInfo(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
