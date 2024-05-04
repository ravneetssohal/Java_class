package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(3);
        nums.add(4);

        List<Integer> list = new ArrayList<>();
        System.out.println(nums);
    }

}
