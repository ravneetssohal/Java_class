package Assignments;

public class Sort {
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

        Sort sort = new Sort();
        sort.sort(number);

        System.out.print("Sorted Array = {");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + ",");
        }
        System.out.print("}");
    }
}
