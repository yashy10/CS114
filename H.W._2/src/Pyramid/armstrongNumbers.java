package Pyramid;

import java.util.Scanner;

public class armstrongNumbers {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the lower limit: ");
        int lowerLimit = input.nextInt();

        System.out.println("Enter the upper limit: ");
        int upperLimit = input.nextInt();

        System.out.println("The Armstrong numbers that are in between " + lowerLimit + " and " + upperLimit + " are: ");

        for (int number = lowerLimit; number <= upperLimit; number++) {
            int numDigits = String.valueOf(number).length();
            int sum = 0, temp = number;

            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, numDigits);
                temp /= 10;
            }

            if (sum == number) {
                System.out.print(number + " ");
            }
        }
    }
}
