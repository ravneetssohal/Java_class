package collections1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> listOfEmployees = new ArrayList<>();

        listOfEmployees.add(new Employee("Ravneet", "rave@gmail.com", 28, "Canada"));
        listOfEmployees.add(new Employee("Rav", "rav@gmail.com", 23, "Canada"));
        listOfEmployees.add(new Employee("Something", "something@gmail.com", 48, "Canada"));
        listOfEmployees.add(new Employee("Ti", "ti@gmail.com", 25, "Canada"));


        for (Employee employee1 : listOfEmployees){
            if(employee1.age >= 28){
                System.out.println(employee1);
            }
        }
    }
}
