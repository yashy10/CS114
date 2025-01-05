import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("We will now convert your farthings into a different currency: ");

            Scanner input = new Scanner(System.in);

            double farthings = input.nextDouble();

            double sterling = farthings/960;

            double shilling = farthings % 960;

        System.out.println("Sterling = " + sterling + "Shilling = " + shilling);


    }
}