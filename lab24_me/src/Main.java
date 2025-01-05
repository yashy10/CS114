import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean validInput = false;
        int num1 = 0; int num2 = 0;

        while(!validInput) {
            try {
                System.out.println("Please enter one integer: ");
                num1 = input.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Input mismatch Exception" + e.getMessage());
                input.next();
            }
        }

        validInput = false;

        while(!validInput){
            try {
                System.out.println("Please enter the second integer: ");
                num2 = input.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Input mismatch Exception" + e.getMessage());
                input.next();
            }
        }
        System.out.println("Result:" + (num1 + num2));

    }
}