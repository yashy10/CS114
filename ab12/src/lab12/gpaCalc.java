package lab12;

import java.util.Scanner;
import java.util.Arrays;

public class gpaCalc {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("How many grades would you like to enter");
        int gradeNums = input.nextInt();
        String[] grades = new String[gradeNums];
        for (int i = 0; i < gradeNums; i++) {
            System.out.println("Please enter grade " + (i + 1) + ":");
            grades[i] = input.next().toLowerCase();
            if (!grades[i].matches("a|b|c|d|f|p|nc")){
                System.out.println("-1.0");
                return;
            }
        }
        double gpa = 0.0;

        for (int i = 0; i < grades.length; i++){
            switch(grades[i]){
                case "a":
                    gpa += 4.0;
                    break;
                case "b":
                    gpa += 3.0;
                    break;
                case "c":
                    gpa += 2.0;
                    break;
                case "d":
                    gpa += 1.0;
                    break;
                case "f":
                    gpa += 0.0;
                    break;
                case "p":
                    gradeNums -= 1;
                    break;
                case "nc":
                    gradeNums -=1;
                    break;
                default:
                    gpa *= 0 - 1.0;
                    break;
            }
            if (gpa == -1.0){
                break;
            }
        }
        if(gpa > 0) {
            System.out.println(gpa / gradeNums);
        }else if(gradeNums > 0){
            System.out.println(gpa);
        }else {
            System.out.println("-1.0");
        }

        System.out.println(Arrays.toString(grades));
    }
}
