package collections1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(20);

//        for (int element : list){
//            list.remove(2);
//        }

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            Integer next = iterator.next();
            if(next == 40){
                iterator.remove();
            }
        }

        System.out.println(list);

    }
}
