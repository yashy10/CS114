import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of water in kilograms:");
        double water = input.nextDouble();

        System.out.println("Enter the initial temperature: ");
        double temparature = input.nextDouble();

        System.out.println("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        double energyQ = water * (finalTemperature - temparature) * 4184;
        System.out.println("The energy needed is " + energyQ);
    }
}