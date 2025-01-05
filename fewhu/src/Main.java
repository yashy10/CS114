import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 1. Creating an ArrayList of Strings
        ArrayList<String> cities = new ArrayList<String>();
        System.out.println("Initial cities list: " + cities); // []

        // 2. Adding elements
        cities.add("New York");
        cities.add("Paris");
        cities.add("Tokyo");
        System.out.println("Cities after adding elements: " + cities);

        // 3. Accessing elements
        String firstCity = cities.get(0); // Get the first element
        System.out.println("First city: " + firstCity);

        // 4. Modifying an element
        cities.set(1, "London"); // Replace "Paris" with "London"
        System.out.println("Cities after modification: " + cities);

        // 5. Removing elements
        cities.remove("Tokyo"); // Remove "Tokyo" by name
        System.out.println("Cities after removing Tokyo: " + cities);

        cities.remove(0); // Remove the first element
        System.out.println("Cities after removing the first element: " + cities);

        // 6. Checking if the ArrayList contains an element
        boolean containsLondon = cities.contains("London");
        System.out.println("Contains London? " + containsLondon);

        // 7. Clearing the ArrayList
        cities.clear();
        System.out.println("Cities after clearing: " + cities); // []

        // 8. Adding integers to an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        System.out.println("Numbers list: " + numbers);

        // 9. Finding the size of the ArrayList
        System.out.println("Size of numbers list: " + numbers.size());

        // 10. Sorting the ArrayList
        Collections.sort(numbers);
        System.out.println("Numbers after sorting: " + numbers);

        // 11. Reversing the ArrayList
        Collections.reverse(numbers);
        System.out.println("Numbers after reversing: " + numbers);

        // 12. Shuffling the ArrayList
        Collections.shuffle(numbers);
        System.out.println("Numbers after shuffling: " + numbers);

        // 13. Converting ArrayList to an array
        Integer[] numbersArray = numbers.toArray(new Integer[0]);
        System.out.println("Converted to array: ");
        for (int num : numbersArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 14. Converting array back to ArrayList
        ArrayList<Integer> newNumbersList = new ArrayList<>(List.of(numbersArray));
        System.out.println("Converted back to ArrayList: " + newNumbersList);
    }
}
