
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 integers: ");
        int[] nums = new int[10]; //ARRAY HAS 10 INTS

        for (int i = 0; i < 10; i++) {
            nums[i] = input.nextInt(); //STORE EACH INTEGER AS AN INDEX
        }


        for (int i = 0; i < nums.length / 2; i++) { //LENGTH IS 10/2 = 5
            int temp = nums[i]; //temp is 1 when i is zero //
            nums[i] = nums[nums.length - 1 - i]; // array [0] is now array [9]
            nums[nums.length - 1 - i] = temp; //temp is now equal to nums [9]
        }// 2 = 9 ;
        // {1,2,3,4,5,6,7,8,9,10}
        // {
        //[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        //
        System.out.println(Arrays.toString(nums));


    }
}