package HW1;

import java.util.Scanner;
//Student ID: 116203702
public class ShowMeTheMoney {
    public static void main(String[] args) {

        System.out.println("We will now convert your farthings into a different currency: ");

        Scanner input = new Scanner(System.in);
        int farthings, penny, shilling, pound, rem;

        farthings = input.nextInt();

        pound = farthings/960;
        System.out.println("Farthings: " + pound);
        rem = farthings%960;

        shilling=rem/48;
        System.out.println("Shilling: " + shilling);
        rem=rem % 48;

        penny= rem / 4;
        System.out.println("Penny: " + penny);

        farthings = rem % 4;
        System.out.println("farthings " + farthings);



    }
}