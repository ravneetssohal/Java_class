package OOPs;

public class ScotiaBank extends BankOfCanada{

    double minimumDeposit;
    double fees;

    public ScotiaBank(String accountInfo, int accountNumber, double mortgageRate, double minimumDeposit, double fees) {
        super(accountInfo, accountNumber, mortgageRate);
        this.minimumDeposit = minimumDeposit;
        this.fees = fees;
    }

    public void printScotiaInfo(){
        System.out.println("Minimum Deposit: " + minimumDeposit);
        System.out.println("Monthly Fees" + fees);
    }
}
