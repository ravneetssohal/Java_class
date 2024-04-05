package loops;


import java.util.Scanner;

public class LuckyNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Lottery System. You have three tries.");
        int luckyNum = 55;
        int tries = 3;

        while (tries >= 0) {
            if (tries >= 1 && tries <= 3) {
                System.out.print("Enter a number between 1 and 100. You have " + tries + " tries remaining: ");
                int number = scanner.nextInt();

                if (number < 1 || number > 100) {
                    System.out.println("Number should be between 1 and 100. Try Again");
                } else if (number == luckyNum) {
                    System.out.println("Congratulations, you won the jackpot.");
                    break;
                } else if (tries == 1) {
                    tries--;
                } else {
                    System.out.println("Sorry, you may try again.");
                    tries--;
                }
            } else {
                System.out.println("You have run out of tries. Better luck next time.");
                break;
            }
        }
        scanner.close();
        /*for (int i = 3; i > 0 ; i--){
            System.out.print("Enter a number between 1 and 100. You have " + i + " tries remaining: ");
            int number = scanner.nextInt();
            int luckyNum = 55;
            if(number >= 1 && number <= 100) {

                if (number == luckyNum) {
                    System.out.println("Congratulations, you won the jackpot.");
                    break;
                } else {
                    System.out.println("Sorry, you may try again.");
                }
            }else{
                System.out.println("Number should be between 1 and 100.");
            }
        }*/
        /*while(true) {
            System.out.print("Enter a number between 1 and 100: ");
            int number = scanner.nextInt();
            int luckyNum = 55;
            if(number >= 1 && number <= 100) {

                if (number == luckyNum) {
                    System.out.println("Congratulations, you won the jackpot.");
                    break;
                } else {
                    System.out.println("Sorry, you may try again.");
                }
            }else{
                System.out.println("Number should be between 1 and 100.");
            }
        }*/

    }
}