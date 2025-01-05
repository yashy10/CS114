package Summation;

import java.util.Scanner;

public class thirdPerson {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = input.next();

        if (word.endsWith("y")){
            String newWord = word.substring(0, word.length() - 1) + "ies";
            System.out.println(newWord);
        }
        else if(word.endsWith("o") || word.endsWith("s") || word.endsWith("x") || word.endsWith("ch") || word.endsWith("sh")){
            System.out.println(word + "es");
        }
        else {
            System.out.println(word + "s");
        }
    }
}
