package HW1;

import java.util.Scanner;
//Student ID: 116203702
public class Eggs {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("How many eggs would you like: ");
        int numEggs = input.nextInt();

        int dozen = numEggs / 12;
        int remEggs = numEggs % 12;

        double dozenCost = dozen * 3.25;
        double remainingEggs = remEggs * 0.45;

        double total = dozenCost + remainingEggs;

        System.out.println("You ordered " + numEggs + " eggs. That’s " + dozen + " dozen at $3.25 " +
                "per dozen and " + remEggs + " loose eggs at 45 cents for a total of $" + total + "." );
    }
}
