package quadratic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("We will now be solving the quadratic function using a,b,c.");

        System.out.println("Please enter value for a:");
        double a = input.nextDouble();
        System.out.println("Please enter value for b: ");
        double b = input.nextDouble();
        System.out.println("Please enter value for c: ");
        double c = input.nextDouble();

        double discriminant = (Math.pow(b,2) - (4*a*c));
        double squareRoot = Math.pow (discriminant,0.5);

        double result1 = (-b + squareRoot)/(2*a);
        double result2 = (-b - squareRoot)/(2*a);

        if (discriminant > 0){
            System.out.println("The equation has two roots " + result1 + " and " + result2);
        }
        else if (discriminant == 0){
            System.out.println("The equation has one root " + result1);
        }
        else{
            System.out.println("The equation has no real roots.");
        }

    }
}