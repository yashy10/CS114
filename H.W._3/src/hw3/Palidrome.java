package hw3;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word you want to be reversed:");
        String phrase = "";
        phrase = input.nextLine();
        phrase = phrase.replace(" ", "");

        if(isPalindrome(phrase)){
            System.out.println("Input string " + phrase + " is a palindrome");
        }else{
            System.out.println("Input string " + phrase + " is not a palindrome");
        }

    }
    public static boolean isPalindrome(String phrase) {

        phrase = phrase.replace(" ", "").toLowerCase();

        for (int i = 0; i < phrase.length(); i++) {
            String phrase2 = new StringBuilder(phrase).reverse().toString();
            if (!phrase2.equals(phrase)) {
                return false;
            }
        }
        return true;
    }
}
