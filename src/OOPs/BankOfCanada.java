package OOPs;

public class BankOfCanada extends Bank{

    double mortgageRate;

    public BankOfCanada(String accountType, int accountNumber, double mortgageRate) {
        super(accountType, accountNumber);
        this.mortgageRate = mortgageRate;
    }

    public void printMortgageRate(){
        System.out.println("Mortgage Rate: " + mortgageRate);
    }
}
