package exceptionHandling;

import java.util.Scanner;

public class HandlingTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = null;

        int[] numbers = {1,2,3,4,5};
        int input = scanner.nextInt();
        try {
            s = s.toUpperCase();
        }catch (NullPointerException e){
            System.out.println("String must not be null.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Input must be between 0 and " + numbers.length + ".");
        }catch (Exception e){
            System.out.println("Something went wrong.");
        }

        try{
            System.out.println(numbers[input]);
        }catch (NullPointerException e){
            System.out.println("String must not be null.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Input must be between 0 and " + numbers.length + ".");
        }catch (Exception e){
            System.out.println("Something went wrong.");
        }
    }
}
