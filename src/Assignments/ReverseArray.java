package Assignments;

public class ReverseArray {

    public void reverse(int[] number){
        int end = number.length - 1;
        int temp;
        for (int start = 0; start <= end; start++) {
            temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] number = {10,30,43,54,23,543,43,32};
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverse(number);

        System.out.print("Reversed Array = {");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + ",");
        }
        System.out.print("}");
    }
}
