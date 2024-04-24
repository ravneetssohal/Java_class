package OOPs;

public class Bank {
    String accountType;
    int accountNumber;

    public Bank(String accountType, int accountNumber) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
    }

    public void printBankDetails(){
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
    }
}
