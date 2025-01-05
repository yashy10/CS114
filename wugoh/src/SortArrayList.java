import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter five numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }

        sort(numbers);

        System.out.println("Numbers in increasing order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
