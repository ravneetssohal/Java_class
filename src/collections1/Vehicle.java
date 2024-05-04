package collections1;

public class Vehicle<T,R> {
    T year;
    R make;
    R model;
    T price;

    public Vehicle(T year, R make, R model, T price) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}

class VehicleMain{
    public static void main(String[] args) {
        Vehicle<Integer,String> vehicle = new Vehicle<>(2012, "Nissan", "Altima", 5000);
        System.out.println(vehicle);

    }
}
