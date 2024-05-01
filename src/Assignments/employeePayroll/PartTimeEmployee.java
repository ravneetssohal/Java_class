package Assignments.employeePayroll;

public class PartTimeEmployee extends Employee{
    public PartTimeEmployee(int employeeID, String name, String employmentType, double wage) {
        super(employeeID, name, employmentType, wage);
    }

    @Override
    public double calculatePay() {
        return (wage * 20) - (0.20 * wage * 20);
    }
}
