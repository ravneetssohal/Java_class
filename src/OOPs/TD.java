package OOPs;

public class TD extends BankOfCanada{
    double minimumDeposit;
    double fees;

    public TD(String accountInfo, int accountNumber, double mortgageRate, double minimumDeposit, double fees) {
        super(accountInfo, accountNumber, mortgageRate);
        this.minimumDeposit = minimumDeposit;
        this.fees = fees;
    }

    public void printTDInfo(){
        System.out.println("Minimum Deposit: " + minimumDeposit);
        System.out.println("Monthly Fees" + fees);
    }
}
