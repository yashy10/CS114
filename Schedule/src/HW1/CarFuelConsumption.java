package HW1;

import java.util.Scanner;
//Student ID: 116203702
public class CarFuelConsumption {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of minutes a car has driven on the long track: ");
        double minutes = input.nextDouble();

        System.out.println("Please enter the constant speed of the car, given in miles per hour: ");
        double speed = input.nextDouble();

        System.out.println("Please enter the fuel efficiency of the car, given in miles per gallon: ");
        double fuelEfficiency = input.nextDouble();

        double result = (minutes/60) * speed * (1/fuelEfficiency);

        System.out.println(result);

    }
}
