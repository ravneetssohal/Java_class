package Assignments;

public class SecondMaxAndMin {
    public void sort(int[] number){
        int temp;
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                if (number[i] > number[j]) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] number = {10,30,43,54,23,543,43,32};

        SecondMaxAndMin secondMaxAndMin = new SecondMaxAndMin();
        secondMaxAndMin.sort(number);

        System.out.println("Second minimum element in the given array is " + number[1] + ".");
        System.out.println("Second maximum element in the given array is " + number[number.length - 2] + ".");

    }
}
