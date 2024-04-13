package stringsAndArrays;

public class ArraySum1 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};

        /*int start = 0;
        int end = arr.length - 1;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[start];
            arr[end] = arr[start];
            arr[end] = temp;

            end--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        //This solution has a time complexity of 2.
        int[] arr2 = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0 ; i < arr.length; i++) {
            arr2[j] = arr[i];
            j--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr2[i]);
        }


    }
}

