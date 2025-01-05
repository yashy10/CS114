package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please provide me your balance so I can produce the intrest: ");
        int balance = input.nextInt();

        System.out.println("Please provide me the interest rate: ");
        double interestRate = input.nextDouble();

        //interestRate = interestRate / 100;

        double interest = balance * (interestRate/1200);

        System.out.println("The interest is " + interest);


    }
}