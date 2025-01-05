package Lab7;

import java.util.Scanner;

public class socialSecurity {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your ssn in format 333-22-4444: ");
        String ssID = input.nextLine();

        String ssIdPattern = "^\\d{3}-\\d{2}-\\d{4}$";


        if (ssID.matches(ssIdPattern)){
            System.out.println(ssID + " is a social security number");
        }
        else{
            System.out.println(ssID + " is not a social security number");
        }



    }
}
