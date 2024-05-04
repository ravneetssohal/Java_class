package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {
    public static void main(String[] args) {

        //Sets cannot have duplicate values. All the values are unique.
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(33);
        nums.add(23);
        nums.add(53);
        nums.add(32);
        nums.add(33);

        System.out.println(nums);

        //TreeSet gives the values in a sorted format.
        //We can use Collection for this as well.
        Set<Integer> nums1 = new TreeSet<>();
        nums1.add(33);
        nums1.add(23);
        nums1.add(53);
        nums1.add(32);

        System.out.println(nums1);

        //Iterates through the set or list.
        Iterator<Integer> values = nums1.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        }

    }
}
