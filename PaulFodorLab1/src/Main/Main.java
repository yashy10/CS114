package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double discount = 0;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Discount simulator: ");

        System.out.println("How many games would you like?");
        double gameNumber = input.nextDouble();
        double price = 100 * gameNumber;
        
        if (gameNumber >= 2 && gameNumber <= 5){
            discount = price * 0.8;
        } else if (gameNumber >= 6 && gameNumber <= 10){
            discount = price * 0.3;
        } else if (gameNumber >= 11){
            discount = price * 0.6;
        } else {
            discount = price;
        }
        
        System.out.println("You have picked " + gameNumber + " games so your final price with discount is " + discount);
        





    }
}