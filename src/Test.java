import java.security.spec.RSAOtherPrimeInfo;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;

import static java.util.Locale.US;
import static java.util.Locale.lookup;

public class Test {
    String student;
    int id;

    public Test(String student, int id) {
        this.student = student;
        this.id = id;
    }



    public static String formatCurrencyWithSymbol(double value, String symbol, Locale locale) {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        Currency currency = Currency.getInstance(locale);
        currencyFormat.setCurrency(currency);
        return currencyFormat.format(value).replace(currency.getSymbol(locale), symbol);
    }
    public static void test(){
        Locale locale = Locale.US;
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormatter.format(12000.222));

        Locale localeIndia = new Locale("en", "IN");
        NumberFormat numberFormatIndia = NumberFormat.getCurrencyInstance(localeIndia);
        String india = formatCurrencyWithSymbol(122222, "Rs.", localeIndia);
        System.out.println("India: " + india);
    }
    public static void main(String[] args){

        /*Calendar calendar = Calendar.getInstance();
        // Set the number as the value of the Calendar's field
        calendar.set(2024,3,12);
        // Get the string representation of the value
        int strNumber = calendar.get(Calendar.DAY_OF_WEEK);
        public static NumberFormat getCurrencyInstance(Locale inLocal);

        // Print the converted string
        System.out.println("Converted String: " + strNumber);
        test();
        String s = "hello";
        String a = "hava";
        System.out.println(s.length());
        System.out.println(s.substring(0,1).toUpperCase() + s.substring(1));
        System.out.println(s.charAt(0) == a.charAt(0));


        }*/
        String A = "hello";
        String B = "helloo";

        int length = 0;
        if(A.length() >= B.length()){
            length = B.length();
        }else{
            length = A.length();
        }

        if(A.equals(B)){
            System.out.println("No");
        } else if (A.substring(0,length).equals(B.substring(0,length))) {
            if(A.length() > B.length()){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        } else {
            for (int i = 0; i < length; i++) {
                if (A.charAt(i) > B.charAt(i)){
                    System.out.println("Yes");
                    break;
                } else if (A.charAt(i) == B.charAt(i)) {
                    continue;
                }else{
                    System.out.println("No");
                    break;
                }
            }
        }

        Test test = new Test("Rav",101);

        System.out.println(test.toString());



        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));


    }
}
