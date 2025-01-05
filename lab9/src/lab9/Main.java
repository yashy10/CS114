package lab9;

import java.util.Scanner;

public class Main {


    public static double areaOfTriange(double base, double height) {
        return 0.5 * base * height;
    }

    public static  void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the base of the triangle: ");
        double base = input.nextDouble();
        System.out.println("Please enter the height of the triangle: ");
        double height = input.nextDouble();

        double area = areaOfTriange(base,height);
        System.out.println("Area of this triangle with base " + base + " and height " + height + " is: " + area);


    }
}