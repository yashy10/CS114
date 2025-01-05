import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){

        int[] nums = {1,2,3,4,5,6};
        printArray(nums);
        reverseArray(nums);
        printArray(nums);
    }
    public static void reverseArray(int[] nums){
        int temp;
        for(int i = 0; i < nums.length/2; i++){
            temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
    }
    public static void printArray(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
    }
}
