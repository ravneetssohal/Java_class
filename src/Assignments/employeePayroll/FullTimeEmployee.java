package Assignments.employeePayroll;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(int employeeID, String name, String employmentType, double wage) {
        super(employeeID, name, employmentType, wage);
    }

    @Override
    public double calculatePay() {
        return (wage * 44) - (0.20 * wage * 44);
    }
}
