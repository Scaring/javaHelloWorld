import java.util.Scanner;

public class FizzBazz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte inputNumber;

        System.out.print("Number: ");
        inputNumber = scan.nextByte();
        scan.close();

        if ((inputNumber % 3 == 0) && (inputNumber % 5 == 0)) {
            System.out.println("FizzBuzz");
        } else if (inputNumber % 3 == 0) {
            System.out.println("Buzz");
        } else if (inputNumber % 5 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(inputNumber);
        }

    }
}
