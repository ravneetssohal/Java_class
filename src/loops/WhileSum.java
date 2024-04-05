package loops;

public class WhileSum {
    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;
        while(counter <= 10){
            System.out.println(counter);
            sum = sum + counter;
            counter++;
        }
        System.out.println("Sum of all the numbers is " + sum + ".");
    }
}
