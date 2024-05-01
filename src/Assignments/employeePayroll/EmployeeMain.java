package Assignments.employeePayroll;

public class EmployeeMain {
    public static void main(String[] args) {
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(100001, "Ravneet", "Part-Time", 25);
        partTimeEmployee.displayInfo();
        partTimeEmployee.calculatePay();
        System.out.println("--------------------");

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(100002, "Rav", "Full-Time", 25);
        fullTimeEmployee.displayInfo();
        fullTimeEmployee.calculatePay();
    }
}
