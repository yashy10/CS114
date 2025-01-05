package PremiumAirlines;

import java.util.Scanner;

public class PremiumAirlines {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        double currentPoints = 0;

        System.out.println("Please enter the membership(Diamond/Platinum/Regular): ");
        String membership = input.next().toUpperCase();

        System.out.println("Please enter the ticket price: ");
        double price = input.nextDouble();
        System.out.println("Please enter your current points");
        double points = input.nextDouble();

        if ((membership.equalsIgnoreCase("Diamond") || membership.equalsIgnoreCase("Platinum")) && price >= 5000){
            currentPoints = points + 35;
            System.out.println("Points " + currentPoints);
        }
        else if (membership.equalsIgnoreCase("Diamond") && price >= 2000 && points > 300){
            currentPoints = points + 30;
            System.out.println("Points: " + currentPoints);
        }
        else if (membership.equalsIgnoreCase("Platinum") && price >= 2000 ){
            currentPoints = points + 20;
            System.out.println("Points: " + currentPoints);
        }
        else if(membership.equalsIgnoreCase("Diamond") && price >= 500 && points > 100){
            currentPoints = points + 10;
            System.out.println("Points: " + currentPoints);
        }
        else if(membership.equalsIgnoreCase("Regular") && price >= 5000){
            currentPoints = points + 5;
            System.out.println("Points: " + currentPoints);
        }
        else if(membership.equalsIgnoreCase("Diamond") && points >= 25){
            currentPoints = points + 2;
            System.out.println("Points: " + currentPoints);
        }
        else{
            currentPoints = points;
            System.out.println("Points: " + currentPoints);
        }
    }
}
