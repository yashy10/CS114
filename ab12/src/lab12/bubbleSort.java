package lab12;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {

        double[] nums = {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
        System.out.println(Arrays.toString(nums));

        bubbleSort1(nums);
        System.out.println(Arrays.toString(nums));


    }
    public static void bubbleSort1(double[] nums){

        double temp = 0.0;

        for (int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}