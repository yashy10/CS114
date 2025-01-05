package Summation;

import java.util.Scanner;

public class Dates {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the date in this format 00/00/0000");
        String date = input.next();

        String key = "\\d{2}/\\d{2}/\\d{4}";
        String[] dateParts = date.split("/");

        String[] monthsArray = {"January", "February", "March", "April", "May", "June" , "July", "August" , "September" , "October" , "November" , "December" };

        int month = Integer.parseInt(dateParts[0]);

        if (date.matches(key)) {
            switch (month) {
                case 1:
                    System.out.println(monthsArray[0] + " " + dateParts[1] + ", " + dateParts[2]);
                    break;
                case 2:
                    System.out.println(monthsArray[1] + " " + dateParts[1] + ", " + dateParts[2]);
                    break;
                case 3:
                    System.out.println(monthsArray[2] + " " + dateParts[1] + ", " + dateParts[2]);
                    break;
                case 4:
                    System.out.println(monthsArray[3] + " " + dateParts[1] + ", " + dateParts[2]);
                    break;
                case 5:
                    System.out.println(monthsArray[4] + " " + dateParts[1] + ", " + dateParts[2]);
                    break;
                case 6:
                    System.out.println(monthsArray[5] + " " + dateParts[1] + ", " + dateParts[2]);
                    break;
                case 7:
                    System.out.println(monthsArray[6] + " " + dateParts[1] + ", " + dateParts[2]);
                    break;
                case 8:
                    System.out.println(monthsArray[7] + " " + dateParts[1] + ", " + dateParts[2]);
                    break;
                case 9:
                    System.out.println(monthsArray[8] + " " + dateParts[1] + ", " + dateParts[2]);
                    break;
                case 10:
                    System.out.println(monthsArray[9] + " " + dateParts[1] + ", " + dateParts[2]);
                    break;
                case 11:
                    System.out.println(monthsArray[10] + " " + dateParts[1] + ", " + dateParts[2]);
                    break;
                case 12:
                    System.out.println(monthsArray[11] + " " + dateParts[1] + ", " + dateParts[2]);
                    break;
                default:
                    System.out.println("Invalid month number.");
                    return;
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
