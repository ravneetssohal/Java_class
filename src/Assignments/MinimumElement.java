package Assignments;

public class MinimumElement {
    public static void main(String[] args) {
        int[] number = {10,30,43,54,23,543,43,32};
        int minElement = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] < minElement) {
                minElement = number[i];
            }
        }

        System.out.println("Minimum Element in the given array is " + minElement + ".");
    }
}
