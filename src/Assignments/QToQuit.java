package Assignments;

import java.util.Scanner;

public class QToQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;

        do{
            System.out.print("Enter a character: ");
            ch = scanner.next().charAt(0);

            if(ch == 'q' || ch == 'Q'){
                System.out.println("Quit");
                break;
            }else{

            }

        }while(true);
        scanner.close();
    }
}
