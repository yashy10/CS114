package lab10;

import java.util.Scanner;

public class reverseInteger {
    public static void reverse(int number) {

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println(reversed);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number wanted to be reversed: ");
        int number = input.nextInt();

        reverse(number);
    }
}
