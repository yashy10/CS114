import java.util.Scanner;

public class StandardDeviationCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter: ");
        int n = input.nextInt();

        double[] nums = new double[n];

        System.out.println("Please enter the numbers: ");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextDouble();
        }

        double meanValue = mean(nums);
        double standardDeviationValue = deviation(nums, meanValue);

        System.out.printf("The mean is: " + meanValue);
        System.out.printf("The standard deviation is : " + standardDeviationValue);
    }

    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum / x.length;
    }

    public static double deviation(double[] x, double mean) {
        double sumSquaredDiffs = 0;
        for (int i = 0; i < x.length; i++) {
            sumSquaredDiffs += Math.pow(x[i] - mean, 2);
        }
        return Math.sqrt(sumSquaredDiffs / (x.length - 1));
    }
}
