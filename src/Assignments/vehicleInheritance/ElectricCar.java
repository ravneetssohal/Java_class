package Assignments.vehicleInheritance;

public class ElectricCar extends Car{
    int batteryCapacity;

    public ElectricCar(String make, String model, int year, int numDoors, int batteryCapacity) {
        super(make, model, year, numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    public void printCapacity(){
        System.out.println("Battery Capacity: " + batteryCapacity + " miles");
    }
    public void chargeBattery(){
        System.out.println("The car is charging.");
    }
}
