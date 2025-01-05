import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] m = {{4, 2, 3, 5}, {1, 7, 2, 8},{1,7,2,4},{4, 5, 6, 1}, {1, 2, 1, 9}, {1, 1, 5, 3}, {4, 1, 5, 2}, {1, 1, 2, 3}};

        System.out.println("Original array:");
        System.out.println(Arrays.deepToString(m));

        bubbleSort(m);

        System.out.println("\nSorted array:");
        System.out.println(Arrays.deepToString(m));

        System.out.println("\nFirst two elements of each sorted row:");
        for (int[] row : m) {
            System.out.println("[" + row[0] + ", " + row[1] + "]");
        }
    }

    public static void bubbleSort(int[][] m) {
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = 0; j < m.length - i - 1; j++) {
                if (m[j][0] > m[j + 1][0] ||
                        (m[j][0] == m[j + 1][0] && m[j][1] > m[j + 1][1]) ||
                        (m[j][0] == m[j + 1][0] && m[j][1] == m[j + 1][1] && m[j][2] > m[j + 1][2]) ||
                        (m[j][0] == m[j + 1][0] && m[j][1] == m[j + 1][1] && m[j][2] == m[j + 1][2] && m[j][3] > m[j + 1][3])) {
                    int[] temp = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = temp;
                }
            }
        }
    }
}
