import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please input a String");
        String s = input.nextLine();
        ArrayList<Character> charList = toCharacterArray(s);

        System.out.println("Printing out characters in array");
        for (int i = 0; i < charList.size(); i++){
            System.out.print(charList.get(i) + " ");
        }


    }
    public static ArrayList<Character> toCharacterArray(String s){
        ArrayList<Character> charList = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            charList.add(s.charAt(i));
        }
        return charList;
    }

}