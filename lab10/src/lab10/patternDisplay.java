package lab10;

import java.util.Scanner;

public class patternDisplay {

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer value for the pattern: ");
        int n = scanner.nextInt();

        displayPattern(n);
    }
}
