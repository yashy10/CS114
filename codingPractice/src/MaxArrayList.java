import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class MaxArrayList{
    public static void main(String[] args){

        ArrayList<Integer> nums = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please input the values wanted in the array list");

            int numbers = input.nextInt();
            for (int i = 1; i <= numbers; i++) {
                System.out.println("Please enter the " + i + " term.");
                nums.add(input.nextInt());
            }
            System.out.println(max(nums, numbers));
        } catch(InputMismatchException e){
            System.out.println(e.getMessage());
            input.next();
        }
    }
    public static Integer max(ArrayList<Integer> nums, int numbers){

        int maxNum = 0;
        for(int i = 0; i < numbers; i++){
            if(nums.get(i) > maxNum){
                maxNum = nums.get(i);
            }
        }
        return maxNum;
    }
}