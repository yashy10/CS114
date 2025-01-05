package Pyramid;

import java.util.Scanner;

public class longestCommonPrefix {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first String: ");
        String firstString = input.nextLine();

        System.out.println("Please enter the second String: ");
        String secondString = input.nextLine();

        int minLength = Math.min(firstString.length(), secondString.length());
        int index = 0;

        while (index < minLength && firstString.charAt(index) == secondString.charAt(index)) {
            index++;
        }

        if (index > 0) {
            System.out.println("The common prefix is: " + firstString.substring(0, index));
        } else {
            System.out.println(firstString + " and " + secondString + " have no common prefix.");
        }
    }
}
