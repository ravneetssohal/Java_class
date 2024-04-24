package OOPs;

public class BankMain {
    public static void main(String[] args) {

        RBC rbc = new RBC("Savings", 10000001, 5, 10000, 10);
        rbc.printBankDetails();
        rbc.printMortgageRate();
        rbc.printRBCInfo();

        System.out.println("---------------------");

        ScotiaBank scotiaBank = new ScotiaBank("Chequing", 10000021, 4, 10000, 15);
        scotiaBank.printBankDetails();
        scotiaBank.printMortgageRate();
        scotiaBank.printScotiaInfo();

        System.out.println("---------------------");

        TD td = new TD("TFSA", 10003021, 4, 5000, 13);
        td.printBankDetails();
        td.printMortgageRate();
        td.printTDInfo();
    }
}
