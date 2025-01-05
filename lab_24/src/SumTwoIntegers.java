import java.util.Scanner;
import java.util.InputMismatchException;

public class SumTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the first integer: ");
                num1 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }

        validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the second integer: ");
                num2 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        scanner.close();
    }
}
