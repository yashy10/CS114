import java.util.ArrayList;
import java.util.Scanner;

public class GradeConverter {

    public static ArrayList<Character> convertGrades(ArrayList<Integer> grades) {
        ArrayList<Character> letterGrades = new ArrayList<>();
        for (int grade : grades) {
            if (grade >= 90) {
                letterGrades.add('A');
            } else if (grade >= 80) {
                letterGrades.add('B');
            } else if (grade >= 70) {
                letterGrades.add('C');
            } else if (grade >= 60) {
                letterGrades.add('D');
            } else {
                letterGrades.add('F');
            }
        }
        return letterGrades;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter five grades (0 to 100):");

        for (int i = 0; i < 5; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades.add(scanner.nextInt());
        }

        ArrayList<Character> letterGrades = convertGrades(grades);

        System.out.println("Letter grades:");
        for (char letter : letterGrades) {
            System.out.print(letter + " ");
        }

        scanner.close();
    }
}
