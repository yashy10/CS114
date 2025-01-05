package Lab7;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Chose your weapon: ");
        String weapon = input.next().toLowerCase();
        System.out.println("The user picked " + weapon);

        final List<String> options = Arrays.asList("rock", "paper", "scissors");
        Random random = new Random();
        String computerSelection = options.get(random.nextInt(3));

        System.out.println("The computer picked " + computerSelection);

        if (computerSelection.equals("rock") && weapon.equals("paper")){
            System.out.println("You win!");
        }
        else if (computerSelection.equals("paper") && weapon.equals("scissors")){
            System.out.println("You win!");
        }
        else if(computerSelection.equals("scissors") && weapon.equals("rock")){
            System.out.println("You win!");
        }
        else if(computerSelection.equals("rock") && weapon.equals("scissors")) {
            System.out.println("You lose!");
        }
        else if(computerSelection.equals("paper") && weapon.equals("rock")) {
            System.out.println("You lose!");
        }
        else if(computerSelection.equals("scissors") && weapon.equals("paper")) {
            System.out.println("You lose!");
        }
        else if(computerSelection.matches(weapon)) {
            System.out.println("You Tie!");
        }
    }
}
