package Assignments;

public class EmployeePayroll {
    int employeeId;
    String employeeName;
    double basicSalary;
    String designation;

    public EmployeePayroll(int employeeId, String employeeName, double basicSalary, String designation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.designation = designation;
    }

    public double grossSalary(){
        // Bonus is 10% of the base salary.
        double bonus = basicSalary / 10;
        // Vacation Pay is 4% of the base salary.
        double vacationPay = 0.04 * basicSalary;
        double grossSalary = basicSalary + bonus + vacationPay;
        return grossSalary;
    }

    public double deductions(double grossSalary){
        // CPP is 8% of the gross salary.
        double cpp = 0.08 * grossSalary;
        //Tax on the first 50000 is 10% of the gross salary.
        double tax1 = 0.1 * 50000;
        //Tax on the remaining amount is 15% of the gross salary.
        double tax2 = 0.15 * (grossSalary - 50000);
        //EI is 1% of the gross salary.
        double ei = 0.01 * grossSalary;
        //RRSP contribution is 1% of the gross salary.
        double rrsp = 0.01 * grossSalary;
        double deductions = cpp + tax1 + tax2 + ei + rrsp;
        return deductions;
    }

    public double netSalary(double grossSalary, double deductions){
        double netSalary = grossSalary - deductions;
        return netSalary;
    }

    public static void main(String[] args) {
        EmployeePayroll employeePayroll = new EmployeePayroll(100, "Ravneet", 100000, "Full Stack Developer");

        double grossSalary = employeePayroll.grossSalary();
        System.out.println("Your gross salary is " + grossSalary);

        double deductions = employeePayroll.deductions(grossSalary);
        System.out.println("Your total deductions based on your gross salary is " + deductions);

        double netSalary = employeePayroll.netSalary(grossSalary, deductions);
        System.out.println("Your net pay is " + netSalary);

    }
}
