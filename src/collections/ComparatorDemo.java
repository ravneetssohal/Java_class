package collections;

import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {

        //Comparator is used if we want to pass our own logic to sort.
        Comparator<Integer> com = (i, j) -> {
            if(i % 10 > j % 10)
                return 1;
            else
                return -1;
        };

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(63);
        nums.add(31);
        nums.add(77);
        nums.add(13);
        Collections.sort(nums);
        System.out.println(nums);
        Collections.sort(nums, com);
        System.out.println(nums);

    }
}
