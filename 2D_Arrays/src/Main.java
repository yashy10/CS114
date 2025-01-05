import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] nums = new int[3][3];
        System.out.println("Please enter the integers: ");
        fillArray(nums,input);
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - 1; j++){
                System.out.print(nums[i][j] + " ");
            }
        }
    }
    public static void fillArray(int[][] nums, Scanner input){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length - 1; j++){
                nums[i][j] = input.nextInt();
            }
        }
    }
}