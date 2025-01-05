import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        double numbers = 0;

        for (int i = 1; i <= 100; i++){
            numbers += (Math.pow((-1),(i + 1)) / ((2 * i) -1));
        }
        System.out.println(4 * numbers);

    }
}