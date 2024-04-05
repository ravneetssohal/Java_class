package classesAndObject;

import java.util.Scanner;

public class Employee {
    public void printEmployeeDetails(String name, int id){
        System.out.println(name);
        System.out.println(id);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee name: ");
        String ename = scanner.next();
        System.out.print("Enter the employee id: ");
        int eid = scanner.nextInt();
        employee.printEmployeeDetails(ename, eid);

    }
}
