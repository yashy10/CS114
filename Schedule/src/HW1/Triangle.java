package HW1;

import java.util.Scanner;
//Student ID: 116203702
public class Triangle {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side1: ");
        int side1 = input.nextInt();
        System.out.println("Enter the side2: ");
        int side2 = input.nextInt();
        System.out.println("Enter the side3: ");
        int side3 = input.nextInt();

        if (side1 + side2 < side3){
            System.out.println("Output : invalid");
        }
        else if (side1 == side2 && side2 == side3){
            System.out.println("Output: Equilateral Triangle");
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3){
            System.out.println("Output: Isosceles Triangle");
        }
        else {
            System.out.println("Output: Scaleneles Triangle");
        }

    }
}
