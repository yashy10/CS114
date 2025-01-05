package PremiumAirlines;

import java.util.Random;

public class RandInt {
    public static void main (String[] args){

        Random randNumb = new Random();

        double sum = 0;
        double total = 0;
        int i;
        int min = 0;
        int max = 99;

        for (i = 0; i < 10; i++){
            int randomIntInRange = randNumb.nextInt(min,max);
            System.out.println(randomIntInRange);
            total = sum + randomIntInRange;
        }
        double avg = total/i;
        System.out.println("The average of these " + i + " integers are " + avg);


    }
}
