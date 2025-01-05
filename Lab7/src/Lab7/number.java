package Lab7;

import java.util.Scanner;

public class number {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String firstThree = "";
        String secondThree = "";
        String thirdThree = "";

        System.out.println("Please enter your phone number:");
        String digits = input.next();

        if (digits.length() == 10) {
            firstThree = digits.substring(0, 3);
            secondThree = digits.substring(3, 6);
            thirdThree = digits.substring(6, 10);
            System.out.println("(" + firstThree + ")-" + secondThree + "-" + thirdThree);
        }
        else {
            System.out.println("Invalid input");
        }
    }
}