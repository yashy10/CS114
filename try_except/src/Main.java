import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println("Would you like to use addition, subtraction, multiplication or division");
            String math = input.next();
            if (math.equals("addition")) {
                System.out.println("Result: " + (num1 + num2));
            } else if (math.equals("subtraction")) {
                System.out.println("Result: " + (num1 - num2));
            } else if (math.equals("multiplication")) {
                System.out.println("Result: " + (num1 * num2));
            } else if (math.equals("division")) {
                if (num2 == 0) {
                    throw new ArithmeticException("You cannot divide by zero");
                }
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("invalid input");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Error " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        finally{
            System.out.println("Thank you for using the calculator!");
            input.close();
        }
    }
}