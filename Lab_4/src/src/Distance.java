package src;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("We will need a couple values from you so we can find the distance: ");

        System.out.println("Enter x1 value: ");
        double x1 = input.nextDouble();

        System.out.println("Enter y1 value: ");
        double y1 = input.nextDouble();

        System.out.println("Enter x2 value: ");
        double x2 = input.nextDouble();

        System.out.println("Enter y2 value: ");
        double y2 = input.nextDouble();

        double coordinateX = Math.pow((x2 - x1), 2);
        double coordinateY = Math.pow((y2 - y1), 2);

        double result2 = coordinateX + coordinateY;
        double answer = Math.pow(result2,0.5);

        System.out.println(answer);



    }
}
