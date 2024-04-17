package Assignments;

public class AverageOfElements {
    public static void main(String[] args) {
        int[] number = {10,30,43,54,23,543,43,32};

        SumOfElements sumOfElements = new SumOfElements();
        System.out.println("Sum of all the elements in the given array is " + sumOfElements.sum(number) / number.length + ".");
    }
}
