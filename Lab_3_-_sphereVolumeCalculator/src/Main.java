import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double radius , volume ;

        for (int i = 0; i < 4; i++){
            System.out.println("Enter in the radius of the sphere: ");
            radius = input.nextDouble();
            volume = (4.0/3) * Math.PI * (radius * radius * radius);
            System.out.println("The volume of the sphere: " + volume);
        }

    }
}