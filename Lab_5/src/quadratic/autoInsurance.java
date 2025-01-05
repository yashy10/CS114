package quadratic;

import java.util.Scanner;

public class autoInsurance {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the premium price of the auto insurance policy: ");
        double premiumPrice = input.nextDouble();
        System.out.println("Please enter in the person's age: ");
        int age = input.nextInt();
        System.out.println("Please enter in either Male or Female for gender: ");
        String gender = input.next();

        if (age > 18 && age <= 21 && (gender.equals("male") || gender.equals("Male"))){
            double total = premiumPrice * 1;
            System.out.println("100 percent of the " + premiumPrice + " is paid");
            System.out.println(total);
        }
        else if (age > 18 && age <= 21 && (gender.equals("female") || gender.equals("Female"))){
            double total = premiumPrice * 0.9;
            System.out.println("90 percent of the " + premiumPrice + " is paid");
            System.out.println(total);
        }
        else if (age > 21 && age <= 30){
            double total = premiumPrice * 0.75;
            System.out.println("75 percent of the " + premiumPrice + " is paid");
            System.out.println(total);
        }
        else if (age > 30 && age <= 60 && (gender.equals("male") || gender.equals("Male"))){
            double total = premiumPrice * 0.6;
            System.out.println("60 percent of the " + premiumPrice + " is paid");
            System.out.println(total);
        }
        else if (age > 30 && age <= 60 && (gender.equals("female") || gender.equals("Female"))){
            double total = premiumPrice * 0.7;
            System.out.println("70 percent of the " + premiumPrice + " is paid");
            System.out.println(total);
        }
        else if (age > 60){
            double total = premiumPrice * 1;
            System.out.println("100 percent of the " + premiumPrice + " is paid");
            System.out.println(total);
        }
        else{
            System.out.println("-1.0");
        }



    }
}
