package lab10;

import java.util.Scanner;

public class In2Cm {
    public static double inToCm(double in) {
        return in * 2.54;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value in inches: ");

        double inches = scanner.nextDouble();

        double centimeters = inToCm(inches);

        System.out.printf(inches + " inches are " + centimeters + " cm");

    }
}
