package decisionMaking;

public class ifExample {
    public static void main(String[] args){
        int x = 10;
        if(x <= 0){
            System.out.println("x is positive.");
        }
        else{
            System.out.println("x is negative.");
        }

        if(x % 2 == 0){
            System.out.println("x is an even number.");
        }
        else{
            System.out.println("x is an odd number.");
        }

        if(2024 % 4 == 0){
            System.out.println("2024 is a leap year");
        } else{
            System.out.println("2024 is not a leap year");
        }
    }
}
