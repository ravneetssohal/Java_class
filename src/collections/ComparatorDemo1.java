package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


//Comparator is used if we want to pass our own logic to sort.
//Comparable is used to give a class power to compare its objects to itself.
class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class ComparatorDemo1 {
    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student i, Student j) {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> students = new ArrayList<>();
        students.add(new Student(12, "Ravneet"));
        students.add(new Student(13, "Navin"));
        students.add(new Student(22, "Danzo"));
        students.add(new Student(16, "Konan"));

        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();

        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
