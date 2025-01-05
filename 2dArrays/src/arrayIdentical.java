
import java.util.Scanner;
import java.util.Arrays;


public class arrayIdentical {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of values: ");
        int numValues = input.nextInt();

        int[] values = new int[numValues];
        System.out.println("Enter the values: ");
        for(int i = 0; i < values.length; i++){
            values[i] = input.nextInt();
        }
        if(isConsecutiveFour(values)){
            System.out.println("The list has consecutive fours");
        }else{
            System.out.println("The list does not have consecutive fours");
        }

        int [][] m1 = new int[3][3];
        int [][] m2 = new int[3][3];

        System.out.println("Please enter the numbers for the first 3x3 array");
        insertNumbers(m1,input);
        System.out.println("Please enter the numbers for the second 3x3 array");
        m2Array(m2,input);

        if (equals(m1,m2)){
            System.out.println("The two arrays are identical");
        }else{
            System.out.println("The two arrays are not identical");
        }

    }
    public static boolean isConsecutiveFour(int[] values){
        for(int i = 0; i < values.length - 3; i++){
            if (values[i] == values[i+1]){
                if(values[i+1] == values[i+2]){
                    if(values[i+2] == values[i+3]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void insertNumbers(int [][] m1, Scanner input){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                m1[i][j] = input.nextInt();
            }
        }
    }
    public static void m2Array (int [][] m2, Scanner input){
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = input.nextInt();
            }
        }
    }
    public static boolean equals(int [][] m1, int [][] m2){

        for (int i = 0; i < 3; i++) {
            Arrays.sort(m1[i]);
            Arrays.sort(m2[i]);
        }

        return Arrays.deepEquals(m1,m2);
    }
}