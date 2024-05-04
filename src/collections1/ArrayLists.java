package collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(70);
        list1.add(40);
        list1.add(13);
        list1.add(30);

        List<Integer> list2 = new ArrayList<>();
        list2.add(34);
        list2.add(55);
        list2.add(24);
        list2.add(53);
        list2.add(36);

        //add(index, element) where index must be either the next index or one of the already occupied index.
        //It won't replace the element on the index. All the elements will shift an index to accommodate the new element.
        //This is for Arraylist only.
        list1.add(2,43);
        System.out.println(list1.isEmpty());
        list1.addAll(list2);

        System.out.println(list1.equals(list2));

        list1.remove(5);
        System.out.println(list1.lastIndexOf(40));
        Collections.sort(list1);
        Collections.reverse(list1);

        System.out.println();
        for(int num : list1){
            System.out.println(list1.indexOf(num) + ":" + num);
        }

    }
}
