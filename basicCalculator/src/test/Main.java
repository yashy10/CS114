package test;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input two integers: ");
        int firstInt = input.nextInt();
        int secondInt = input.nextInt();

        int radiusInt = firstInt;

        int addInt = firstInt + secondInt;
        int subInt = firstInt - secondInt;
        int mulInt = firstInt * secondInt;
        double divInt = (double) firstInt/secondInt;

        System.out.println("Addition: " + addInt + " Subtraction: " + subInt + " Multiplication: " + mulInt + " Division: " + divInt);

        final double PI = 3.14159;
        double area = PI * Math.pow(radiusInt,2);
        System.out.println("area: " + area);

        int preIncrement = ++firstInt;
        int postIncrement = firstInt++;
        System.out.println("preIncrement" + preIncrement + "PostIncrement" + firstInt);


    }
}