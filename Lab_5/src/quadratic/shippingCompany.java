package quadratic;

import java.util.Scanner;

public class shippingCompany {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the weight of the package: ");
        double packageWeight = input.nextDouble();

        if (packageWeight <= 0) {
            System.out.println("Invalid Input");
        } else if (packageWeight > 0 && packageWeight <= 1) {
            System.out.println("Shipping cost is 3.5$");
        } else if (1 < packageWeight && packageWeight <= 3) {
            System.out.println("Shipping cost is 5.5$");
        } else if (3 < packageWeight && packageWeight <= 10) {
            System.out.println("Shipping cost is 8.5$");
        } else if (10 < packageWeight && packageWeight <= 20) {
            System.out.println("Shipping cost is 10.5$");
        } else {
            System.out.println("The package can not be shipped.");
        }
    }
}
