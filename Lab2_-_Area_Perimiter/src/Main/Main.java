package Main;
//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);

        System.out.println("We will now calculate the area and perimeter. ");
        System.out.println("Radius of circle = 5.5");
        System.out.println();

        double radius = 5.5;

        double Perimeter = 2 * radius * Math.PI;
        double Area = radius * radius * Math.PI;

        System.out.println("The area of the circle is " + Area );
        System.out.println("The perimeter of the circle is " + Perimeter );


    }
}