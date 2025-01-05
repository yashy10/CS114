import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {

        int[] nums = new int[5];

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println("Original Array: " + Arrays.toString(nums));

        reverseArray(nums); System.out.println("Reversed Array: "); printArray(nums);

        bubbleSort(nums); System.out.println("Bubble Sort: ");printArray(nums);
    }

    public static void reverseArray(int[] nums) {

        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }System.out.println();
    }
    public static void bubbleSort(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums.length - 1 - i; j++){
                if (nums[j] < nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

        }
    }

}
