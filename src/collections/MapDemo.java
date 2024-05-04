package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        //Map<String, Integer> students = new Hashtable<>();
        //We can also use HashTable instead of HashMap. They both are same apart from HashTable being Thread safe.
        //HashTable is used when working with multiple threads and we want the threads to be synchronized.

        students.put("Harsh", 80);
        students.put("Navin", 87);
        students.put("Ravneet", 90);
        students.put("Saksham", 99);
        students.put("Navin", 55); //Keys must be unique and repeating keys will be updated with the new values.

        System.out.println(students);
        System.out.println(students.get("Harsh")); //Value of a particular Key.
        System.out.println(students.keySet()); //Set of Keys.
        System.out.println(students.values()); //Set of Values.
        System.out.println();

        for(String key : students.keySet()){
            System.out.println(key + ": " + students.get(key));
        }

    }
}
