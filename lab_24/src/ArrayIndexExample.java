import java.util.Random;
import java.util.Scanner;

public class ArrayIndexExample {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the index of the array (0-99): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }

        scanner.close();
    }
}
