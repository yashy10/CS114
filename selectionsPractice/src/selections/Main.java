package selections;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = getNumbers();
        change(numbers);
        printArray(numbers);

    }
    public static void change(int[] numbers){
        numbers[0] = 0; //{0,2}
        numbers[1] = 1; //{0,1}
    }
    public static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
    public static int[] getNumbers(){
        return new int [] {1,2};
    }
}
