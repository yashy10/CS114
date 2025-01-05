//Write a program that prompts the user to read two integers and displays their sum. Your
//program should prompt the user to read the number again if the input is incorrect. (Hint: Use
//InputMismatchException).
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 0;
        int num2 =0;
        boolean validInput = false;

        while(!validInput){
            try{
                System.out.println("Please enter an Integer: ");
                num = input.nextInt();
                validInput = true;
            }catch(InputMismatchException e){
                System.out.println("Invalid Input");
                input.next();
            }
        }
        validInput = false;

        while(!validInput){
            try{
                System.out.println("Please enter an Integer: ");
                num2 = input.nextInt();
                validInput = true;
            }catch(InputMismatchException e){
                System.out.println("Invalid Input");
                input.nextInt();
            }
        }
        System.out.println("Result: " + (num + num2));

    }
}