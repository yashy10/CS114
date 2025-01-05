package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first String:");
        String firstStringOriginal = input.nextLine();
        System.out.println("Please enter the second String:");
        String secondStringOriginal = input.nextLine();

        String firstString = firstStringOriginal.toLowerCase().replace(" ", "");
        String secondString = secondStringOriginal.toLowerCase().replace(" ", "");

        if (anagrams(firstString, secondString) && length(firstString, secondString)){
            System.out.println(firstString + " and " + secondString + " are anagrams");
        }else{
            System.out.println(firstString + " and " + secondString + " are not anagrams");
        }

    }
    public static boolean length(String firstString, String secondString) {
        return firstString.length() == secondString.length();
    }
    public static boolean anagrams(String firstString, String secondString){

        char[] firstSort = firstString.toCharArray();
        Arrays.sort(firstSort);
        char[] secondSort = secondString.toCharArray();
        Arrays.sort(secondSort);

        return Arrays.equals(firstSort, secondSort);
    }
}
