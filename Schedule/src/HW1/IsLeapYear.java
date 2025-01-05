package HW1;

import java.util.Scanner;
//Student ID: 116203702
public class IsLeapYear {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = input.nextInt();

        if (year % 400 == 0){
            System.out.println(year + " is a leap Year");
        }
        else if (year % 100 == 0){
            System.out.println(year + " is not a leap Year");
        }
        else if (year % 4 == 0) {
            System.out.println(year + " is a leap Year");
        }
        else{
            System.out.println(year + " is not a leap Year");
        }
    }
}
