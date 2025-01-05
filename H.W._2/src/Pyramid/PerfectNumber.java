package Pyramid;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        System.out.print("The perfect numbers below " + upperLimit + " are: ");

        for (int number = 1; number < upperLimit; number++) {
            if (isPerfect(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
