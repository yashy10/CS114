import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Amount: ");
        double amount = input.nextDouble();

        System.out.println("Enter the interest rate: ");
        double interestRate = input.nextDouble();

        System.out.println("Enter number of months: ");
        double months = input.nextDouble();

        double totalInt = 0;
        interestRate = (interestRate / 100) / 12;
        double total = 0;

        for (int i = 1; i <= months; i++) {
            totalInt = (amount + total) * (1 + interestRate);
            total = totalInt;
        }

        System.out.println("Amount in savings: " + total);

        input.close();
    }
}
