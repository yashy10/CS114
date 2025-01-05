
import java.util.Arrays;
import java.util.Scanner;

public class arraysPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter");
        int numCount = input.nextInt();
        int[] nums = new int[numCount];

        System.out.println("Please enter " + numCount + " numbers");
        getNums(nums, input);

        int max = findMax(nums);
        System.out.println(max);

        reverseArray(nums);
        System.out.println(Arrays.toString(nums));

        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));

        fibSequence(numCount);

        searchTarget(nums);
    }
    public static void searchTarget (int[] nums){
        int target = 5;
        for(int i =0; i <nums.length; i++){
            if (nums[i] == target){
                System.out.println("index of target: " + i);
            }
        }


    }
    public static void fibSequence(int numCount) {
        if (numCount <= 0) {
            System.out.println("Invalid input for Fibonacci sequence length.");
            return;
        }
        int[] fibArray = new int[numCount];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i < numCount; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        System.out.println("Fibonacci sequence: " + Arrays.toString(fibArray));
    }

    public static void reverseArray(int[] nums){
        for(int i = 0; i < nums.length/2; i++){
            int temp = nums[i];
            nums [i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
    }
    public static void bubbleSort(int[] nums){

        for(int i = 0; i < nums.length - 1; i++){
            for (int j = 0; j < nums.length - 1 - i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums [j];
                    nums [j] = nums [j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public static void getNums(int [] nums, Scanner input){
        for(int i = 0; i < nums.length; i++){
            nums[i] = input.nextInt();
        }
    }

    public static int findMax(int[] nums){
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}