
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
// import java.util.Arrays;
// import java.util.Date;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scan.nextInt();
        System.out.print("Annual Interest Rate: ");
        float yearRate = scan.nextFloat();
        float monthRate = yearRate / 100 / 12;
        System.out.print("Period (Years): ");
        byte period = scan.nextByte();
        int paymants = period * 12;
        double res = principal * (monthRate * Math.pow((1 + monthRate), paymants))
                / (Math.pow((1 + monthRate), paymants) - 1);
        scan.close();
        double convertedRes = Math.round(res * 100) / 100.00;
        NumberFormat cur = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Mortgage: " + cur.format(convertedRes));
    }
}

// byte myAge = 30;
// long viewsCount = 3_123_456_789L;
// float price = 10.99F;
// char letter = 'A';
// boolean isTrue = true;
// Date now = new Date();
// now. getTime();
// String mes = "Hell";
// int[] nums = { 1, 2, 3, 6, 5, 4, 7, 8 };
// NumberFormat cur = NumberFormat.getCurrencyInstance();
// String res = NumberFormat.getPercentInstance().format(0.1);
// Scanner scan = new Scanner(System.in);
// System.out.print("Name: ");
// String name = scan.nextLine().trim();
// System.out.println("You are " + name);