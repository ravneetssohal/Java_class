package Assignments.employeePayroll;

public class Employee {
    int employeeID;
    String name;
    String employmentType;
    double wage;

    public Employee(int employeeID, String name, String employmentType, double wage) {
        this.employeeID = employeeID;
        this.name = name;
        this.employmentType = employmentType;
        this.wage = wage;
    }

    public double calculatePay(){
        return (wage * 40) - (0.20 * wage * 40);
    }

    public void displayInfo(){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Employment Type: " + employmentType);
        System.out.println("Wage: " + wage);
        System.out.println("Weekly Pay: " + calculatePay());
    }
}
