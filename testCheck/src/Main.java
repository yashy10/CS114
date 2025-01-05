import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter x1");
        double x1 = input.nextDouble();
        System.out.println("Please enter x2");
        double x2 = input.nextDouble();
        System.out.println("Please enter y1 and y2");
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();

        double para = 0.0;
        para = (Math.sin(x1) * Math.sin(x2) + (Math.cos(x1)) * Math.cos(x2) * Math.cos(y1-y2));
        double radians = Math.toRadians(para);
        double radius = 6371.01;
        radius *= radians;
        System.out.println("The distance is:" + radius);
    }
}