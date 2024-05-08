package collections1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(40);
        set.add(30);
        set.add(null);
        set.add(37);
        set.add(43);
        set.add(3);

        System.out.println(set);



        for (Integer element : set){
            System.out.println(element);
        }

        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
