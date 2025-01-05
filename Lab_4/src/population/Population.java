package population;

import java.util.Scanner;

public class Population {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        int lastTwo = year % 100;

        double populationEstimate = ((lastTwo - 10) * 3) + 310;

        System.out.println("Population estimate(millions of people): " + populationEstimate);







    }
}
