package PremiumAirlines;

import java.util.Scanner;
import java.util.Arrays;

public class citiesAlpha {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("I will now ask you to input 3 cities");

        System.out.println("City 1: ");
        String city1 = input.nextLine();

        System.out.println("City 2: ");
        String city2 = input.nextLine();

        System.out.println("City 3: ");
        String city3 = input.nextLine();

        String[] citySort = {city1, city2, city3};

        Arrays.sort(citySort);

        System.out.println("The three cities in alphabetic order are: " + Arrays.toString(citySort));




    }
}
