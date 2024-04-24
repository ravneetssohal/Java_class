package OOPs;

public class RBC extends BankOfCanada{
    double minimumDeposit;
    double fees;

    public RBC(String accountType, int accountNumber, double mortgageRate, double minimumDeposit, double fees) {
        super(accountType, accountNumber, mortgageRate);
        this.minimumDeposit = minimumDeposit;
        this.fees = fees;
    }

    public void printRBCInfo(){
        System.out.println("Minimum Deposit: " + minimumDeposit);
        System.out.println("Monthly Fees: " + fees);
    }
}
