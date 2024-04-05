package loops;

public class SumDoWhile {
    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;
        do{
            System.out.println(counter);
            sum += counter;
            counter++;
        }while(counter <= 10);
        System.out.println("Sum of all the numbers is " + sum + ".");
    }
}
