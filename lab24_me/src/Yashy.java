import java.util.*;

public class Yashy {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] randInts = new int[100];
        Random random = new Random();

        for(int i =0; i < randInts.length; i++){
            randInts[i] = random.nextInt(100) + 1;
        }

        try{
            System.out.println("Please enter the index of the array: ");
            int num = input.nextInt();
            System.out.println("Number at Index " + num + " is " + randInts[num]);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }


    }

}