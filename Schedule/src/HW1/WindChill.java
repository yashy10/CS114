package HW1;

import java.util.Scanner;
//Student ID: 116203702
public class WindChill {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a temperature between -58F and 41F: ");
        double temperature = input.nextDouble();

        System.out.println("Please enter a wind speed greater than or equal to 2: ");
        double windSpeed = input.nextDouble();
        double windSpeedSquared = Math.pow(windSpeed, 0.16);

        double result = 35.74 + (0.621 * temperature) - (35.75 * windSpeedSquared) + (0.4275 * temperature * windSpeedSquared);
        System.out.println("The wind chill temperature is " + result);


    }
}
