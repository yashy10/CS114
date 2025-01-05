package Pyramid;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int lines = input.nextInt();

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines - i - 1; j++) {
                System.out.print("    ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.printf("%4d", (int) Math.pow(2, k));
            }

            for (int l = i - 1; l >= 0; l--) {
                System.out.printf("%4d", (int) Math.pow(2, l));
            }

            System.out.println();
        }
    }
}
