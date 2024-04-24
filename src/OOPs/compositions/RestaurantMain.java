package OOPs.compositions;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("McDonald's", 100, 1920, new RestAddress(15, "Some Street", "Brampton", "L4R 3T2", "ON"));
        System.out.println(restaurant.address.city);
        restaurant.printRestDetails();
    }

}
