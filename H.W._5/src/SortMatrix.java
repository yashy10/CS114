import java.util.Scanner;

public class SortMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        double[][] sortedMatrix = sortRows(matrix);

        System.out.println("The row-sorted array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.3f ", sortedMatrix[i][j]);
            }
            System.out.println();
        }

        input.close();
    }

    public static double[][] sortRows(double[][] m) {
        double[][] sortedMatrix = new double[m.length][m[0].length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sortedMatrix[i][j] = m[i][j];
            }
            bubbleSort(sortedMatrix[i]);
        }

        return sortedMatrix;
    }

    private static void bubbleSort(double[] row) {
        for (int i = 0; i < row.length - 1; i++) {
            for (int j = 0; j < row.length - 1 - i; j++) {
                if (row[j] > row[j + 1]) {
                    double temp = row[j];
                    row[j] = row[j + 1];
                    row[j + 1] = temp;
                }
            }
        }
    }
}
