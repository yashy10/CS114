package Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Rectangle[] rectangles = new Rectangle[3];

        for(int i = 0; i < rectangles.length; i++){
            System.out.println("Do you want to enter the width and height?(y/n)");
            char choice = input.next().charAt(0);

            if(choice == 'y'){
                System.out.println("Please input the width and height: ");
                rectangles[i] = new Rectangle(input.nextDouble(), input.nextDouble());
                System.out.println("Area: " + rectangles[i].getArea());
                System.out.println("Perimeter: " + rectangles[i].getPerimeter());
            }else {
                rectangles[i] = new Rectangle();
                System.out.println("Area: " + rectangles[i].getArea());
                System.out.println("Perimeter: " + rectangles[i].getPerimeter());
            }

        }
    }
}