package OOPs.abstraction;

public class BankOfCanadaMain {
    public static void main(String[] args) {
        BankOfCanada rbc = new RBC();
        rbc.rateOfInterest();

        BankOfCanada scotia = new ScotiaBank();
        scotia.rateOfInterest();

        BankOfCanada td = new TD();
        td.rateOfInterest();
    }
}
