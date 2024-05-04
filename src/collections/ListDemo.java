package collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(3);
        nums.add(7);
        nums.add(1);

        //List supports getting index values. Collection does not.
        //get index value
        System.out.println(nums.get(2));
        //get index of a certain value
        System.out.println(nums.indexOf(3));
    }
}
