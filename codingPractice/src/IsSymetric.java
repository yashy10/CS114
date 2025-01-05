import java.util.*;
import java.io.*;

public class IsSymetric{
    public static void main(String[] args){

        int[][] nums = new int[3][3];
        System.out.println("Please input the integers wanted in your 2dArray: ");
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                nums[i][j] = input.nextInt();
            }
        }
        printArray(nums);

        if(isSymetic(nums)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }
    public static void printArray(int[][] nums){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(nums[i][j] + " ");
            }
        }
    }
    public static boolean isSymetic(int[][] nums){
        boolean check = true;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                if(nums[i][j] != nums[j][i]){
                    check = false;
                }
            }
        } return check;
    }
}