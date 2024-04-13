package stringsAndArrays;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = {10,39,2,4,35,63,24,53,4,3};

        int maxDiff = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > arr[i] && arr[j] > maxDiff){
                    maxDiff = arr[j];
                }
            }
        }
        System.out.println(maxDiff);

    }
}
