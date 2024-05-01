package Assignments.vehicleInheritance;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic", 2024, 4);
        car.displayInfo();
        car.displayDoors();
        car.start();
        System.out.println("--------------");

        ElectricCar electricCar = new ElectricCar("Tesla", "Y", 2022, 4, 400 );
        electricCar.displayInfo();
        electricCar.printCapacity();
        electricCar.chargeBattery();
        System.out.println("--------------");

        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Road King", 2023, 2);
        motorcycle.displayInfo();
        motorcycle.displayCylinders();
        motorcycle.stop();
        System.out.println("--------------");

    }
}
