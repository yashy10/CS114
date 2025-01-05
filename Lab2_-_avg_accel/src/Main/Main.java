package Main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("In this program we will be finding the average acceleration.");

        System.out.println("Please enter the starting velocity: ");
        double v0 = input.nextDouble();
        System.out.println("Please enter the ending velocity: ");
        double v1 = input.nextDouble();
        System.out.println("Please enter the time span in seconds: ");
        double t = input.nextDouble();

        System.out.println("Average Acceleration Formula: (v1 - v0)/t");
        double avgAcceleration = ((v1 - v0)/t);

        System.out.println("Based on the information you gave me the average acceleration would be: " + avgAcceleration);
    }
}