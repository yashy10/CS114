import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the celcius value you want converted to fahrenheit: ");
        double Celsius = input.nextDouble();

        double fahrenheit = Celsius * 1.8 + 32;
        System.out.println(Celsius + " Celsius is " + fahrenheit + " Fahrenheit");

    }
}