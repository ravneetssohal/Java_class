package Assignments;

public class MaximumElement {
    public static void main(String[] args) {
        int[] number = {10,30,43,54,23,543,43,32};
        int maxElement = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] > maxElement) {
                maxElement = number[i];
            }
        }

        System.out.println("Maximum Element in the given array is " + maxElement + ".");
    }
}
