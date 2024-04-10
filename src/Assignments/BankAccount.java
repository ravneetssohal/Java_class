package Assignments;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class BankAccount {
    static Scanner scanner = new Scanner(System.in);
    int accountNumber;
    String accountHolderName;
    double balance;
    String accountType;

    public BankAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void checkDetails(){
        System.out.println("Account number: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Account type: " + accountType);
    }

    public void withdrawMoney(){
        System.out.println("Your current balance is " + balance + "$");
        do{
            System.out.print("Enter the amount you want to withdraw: ");
            double withdrawAmount = scanner.nextInt();
            if (withdrawAmount <= balance) {
                balance -= withdrawAmount;
                System.out.println("Transaction successful");
                System.out.println("Your updated balance is " + balance + "$");
                break;
            } else {
                System.out.println("You don't have enough money in your account for this transaction. Please try again.");
            }
        }while(true);
    }

    public void depositMoney(){
        System.out.println("Your current balance is " + balance + "$");
        System.out.print("Enter the amount you want to deposit: ");
        double depositAmount = scanner.nextInt();
        balance += depositAmount;
        System.out.println("Your updated balance is " + balance + "$");

    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100001, "Ravneet", 100000, "Savings");

        char runAgain = 'y';

        System.out.println("Welcome to our Bank.");
        do{
            System.out.println("1. Check account details.\n2. Withdraw money.\n3. Deposit money.");
            System.out.print("Please choose one of the following options: ");
            int input = scanner.nextInt();
            if (input >= 1 && input <= 3) {
                switch (input) {
                    case 1:
                        bankAccount.checkDetails();
                        break;
                    case 2:
                        bankAccount.withdrawMoney();
                        break;
                    case 3:
                        bankAccount.depositMoney();
                        break;
                }
            } else {
                System.out.println("--------------------");
                System.out.println("Invalid input. Please try again.");
                continue;
            }

            do {
                System.out.println("Do you want to do another transaction? Type (Y/N)");
                runAgain = scanner.next().charAt(0);
                if (runAgain == 'y' || runAgain == 'n') {
                    break;
                } else {
                    System.out.println("---------------------");
                    System.out.println("Invalid input. Please try again.");
                }
            }while(true);

            System.out.println("Thank you for using our Bank.");
        }while(runAgain == 'y');

    }


}
