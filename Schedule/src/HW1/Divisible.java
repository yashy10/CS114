package HW1;

import java.util.Scanner;
//Student ID: 116203702
public class Divisible {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer please: ");
        int num = input.nextInt();

        if (num % 5 == 0 && num % 6 == 0){
            System.out.println("Is " + num + " divisible by 5 and 6? True");
        }
        else{
            System.out.println("Is " + num + " divisible by 5 and 6? False");
        }

        if (num % 5 == 0 || num % 6 == 0){
            System.out.println("Is " + num + " divisible by 5 or 6? True");
        }
        else {
            System.out.println("Is " + num + " divisible by 5 or 6? False");
        }

        if ((num % 5 == 0 && num % 6 != 0) || (num % 6 == 0 && num % 5 != 0)){
            System.out.println("Is " + num + " divisible by 5 or 6, but not both? True");
        }
        else {
            System.out.println("Is " + num + " divisible by 5 or 6, but not both? False");
        }

    }
}
