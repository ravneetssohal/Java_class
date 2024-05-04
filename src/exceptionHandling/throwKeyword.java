package exceptionHandling;

import java.util.Scanner;

public class throwKeyword {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();

        try{
            int div = 1/input;
            if(div == 1) {
                throw new ArithmeticException("blah blah");
            }
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero." + e);
        }catch (Exception e){
            System.out.println("Something went wrong.");
        }
    }
}
