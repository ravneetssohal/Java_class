package stringsAndArrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] animals = {"cat", "dog"};

        int[] arr = {23,5,23,4,3,43,45,4};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int n = scanner.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Printing Elements.");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
