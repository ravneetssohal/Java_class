package OOPs.compositions;

public class Restaurant {
    String name;
    int seatingCapacity;
    int yearEst;
    RestAddress address;

    public Restaurant(String name, int seatingCapacity, int yearEst, RestAddress restAddress) {
        this.name = name;
        this.seatingCapacity = seatingCapacity;
        this.yearEst = yearEst;
        this.address = restAddress;
    }

    public void printRestDetails(){
        System.out.println(name);
        System.out.println(seatingCapacity);
        System.out.println(yearEst);
        System.out.println(address.toString());
    }
}
