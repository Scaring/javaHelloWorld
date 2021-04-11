
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final byte PERCENT = 100;
        final byte MONTH_IN_YEAR = 12;
        final short MIN_PRINCIPAL = 1000;
        final int MAX_PRINCIPAL = 1000000;
        final byte MIN_RATE = 0;
        final byte MAX_RATE = 30;
        final byte MIN_PERIOD = 1;
        final byte MAX_PERIOD = 30;

        int principal;
        float yearRate;
        byte period;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            principal = scan.nextInt();

            if (principal < MIN_PRINCIPAL || principal > MAX_PRINCIPAL) {
                System.out.println("Enter number between 1,000 and 1,000,000.");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            yearRate = scan.nextFloat();

            if (yearRate <= MIN_RATE || yearRate > MAX_RATE) {
                System.out.println("Enter a value greater than 0 and less than or equal to 30.");
                continue;
            }
            break;
        }
        float monthRate = yearRate / PERCENT / MONTH_IN_YEAR;

        while (true) {
            System.out.print("Period (Years): ");
            period = scan.nextByte();

            if (period < MIN_PERIOD || period > MAX_PERIOD) {
                System.out.println("Enter a value between 1 and 30.");
                continue;
            }
            break;
        }

        int paymants = period * MONTH_IN_YEAR;
        scan.close();

        double mortgage = principal * (monthRate * Math.pow((1 + monthRate), paymants))
                / (Math.pow((1 + monthRate), paymants) - 1);

        double countedMortgage = Math.round(mortgage * 100) / 100.00;

        String formatedMortgage = NumberFormat.getCurrencyInstance(Locale.US).format(countedMortgage);

        System.out.println("Mortgage: " + formatedMortgage);
    }
}