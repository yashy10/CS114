package Pyramid;

import java.util.Scanner;

public class Interests {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        System.out.printf("%-15s%-20s%-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        for (double annualInterestRate = 5.0; annualInterestRate <= 8.0; annualInterestRate += 0.125) {
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate /
                    (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
            double totalPayment = monthlyPayment * numberOfYears * 12;

            System.out.printf("%-15.3f%%%-20.2f%-20.2f\n", annualInterestRate, monthlyPayment, totalPayment);
        }
    }
}
