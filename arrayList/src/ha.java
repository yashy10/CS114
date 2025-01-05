import java.util.*;

public class ha {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("How many integers do you want: ");
        int n = input.nextInt();
        double[] nums = new double[n];

        System.out.println("Please enter the first 10 numbers: ");

        for(int i = 0; i < n; i++){
            nums[i] = input.nextDouble();
        }

        double sum = 0;

        for (int i = 0; i < n; i++){
            sum += nums[i];
        }
        double mean = sum/n;
        double top = 0;

        for (int i = 0; i < n; i++){
            top += Math.pow(nums[i] - mean, 2);
        }
        double standardDiviation = 0;
        standardDiviation = Math.pow(top/(n-1),0.5);

        System.out.println("Means:" + mean);
        System.out.println("Standard Diviation" + standardDiviation);



    }
}
