package stringsAndArrays;

import java.util.Scanner;

public class TwoDArraySum {
    public static void main(String[] args) {
        int[][] arr = new  int[3][3];
        int[][] arr1 = new  int[3][3];
        int[][] sum = new  int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the elements of first Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Enter the elements of second Array:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum.length; j++) {
                sum[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(sum[i][j] + " ");
            }
        }

    }
}
