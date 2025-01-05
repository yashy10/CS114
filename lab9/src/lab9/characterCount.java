package lab9;

import java.util.Scanner;

public class characterCount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String phrase;

        char letter;

        System.out.println("Enter a phrase and a letter that reoccurs in the phrase: ");
        phrase= input.nextLine();
        System.out.println("Enter a letter: ");
        letter = input.next().charAt(0);
        System.out.println("The letter " + letter+ " occurs in " + phrase + " " + count(phrase,letter) + " time(s)");
        input.close();
    }
    public static int count(String str, char a) {

        String string = str.toLowerCase();
        int num=0;

        for(int i = 0;i<string.length();i++)
        {
            if(string.charAt(i)==(a))
            {
                num++;
            }
        }
        return num;
    }

}