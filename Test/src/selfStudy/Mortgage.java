package selfStudy;

import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the principle amount: ");
        double principleAmount = input.nextDouble();
        System.out.println("Please enter the years: ");
        double years = input.nextDouble();
        System.out.println("Please enter the interest rates: ");
        double interestRates = input.nextDouble();

        double result = (principleAmount * interestRates)/(1 -(1/Math.pow((1 + interestRates),(years*12))));

        System.out.println(result);


    }
}