package hw3;

import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the decimal number you want to convert to binary:");
        int decimal = input.nextInt();

        System.out.println(dec2Bin(decimal));

    }
    public static String dec2Bin(int decimal){

        if (decimal == 0){
            return "0";
        }

        String binary = "";
        while (decimal > 0){
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal = decimal/2;
        }
        return binary;


    }
}
