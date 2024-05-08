package collections1;

import java.util.*;

public class NoDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 304, 50, 203, 503, 23, 30, 50, 203, 503, 22, 100);

        List<Integer> list1 = new ArrayList<>();

        for(int element : list){
            if(!list1.contains(element)){
                list1.add(element);
            }
        }

        System.out.println(list1);

        //another method
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);


    }
}
