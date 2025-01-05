package hw3;

import java.util.Scanner;

public class BinarytoDecimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the binary value you would like me to convert: ");
        String binary = input.nextLine().replace(" ", "");

        int decimal = bin2Dec(binary);


        if (decimal != -1 || binary.equals(" ")) {
            System.out.println("Decimal: " + decimal);
        } else {
            System.out.println("Invalid binary input. Please enter a number containing only 0 and 1.");
        }

        input.close();
    }
    public static int bin2Dec(String binaryString) {

        int decimal = 0, power =  0;

        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char currentChar = binaryString.charAt(i);

            if(currentChar == '1') {
                decimal += Math.pow(2, power);
            }
            else if(currentChar != '0') {
                return -1;
            }
            power++;
        }

        return decimal;
    }
}