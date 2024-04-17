package Assignments;

public class SumOfElements {

    double sum;
    public double sum(int[] number){
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] number = {10,30,43,54,23,543,43,32};

        SumOfElements sumOfElements = new SumOfElements();
        System.out.println("Sum of all the elements in the given array is " + sumOfElements.sum(number) + ".");
    }
}
