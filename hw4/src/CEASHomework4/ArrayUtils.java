package CEASHomework4;

public class ArrayUtils {

    public static void main(String[] args) {
        int[] randomNumbers = randomArray(100, 21);
        for(int i:randomNumbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("The sum of the array is: " + arraySum(randomNumbers)+"\nThe average is: " +arraySum(randomNumbers)/randomNumbers.length);
        System.out.println(contains(randomNumbers,12));
        System.out.println("There are " + countMultiplesOf(randomNumbers,7) + " numbers that are a multiple of 7");
    }
    public static int[] randomArray(int size, int upLim) {
        int []arr = new int[size];

        for(int i = 0;i<size;i++) {
            arr[i] = (int)(Math.random()*upLim);
        }
        return arr;
    }
    public static void print(int[]arr) {
        System.out.print("[");

        for(int i = 0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]");
    }
    public static double arraySum(int []arr){
        double sum = 0;

        for(int i = 0;i<arr.length;i++) {
            sum+=(double)arr[i];
        }

        return sum;
    }
    public static int contains(int []arr,int num) {
        for(int i = 0;i<arr.length;i++) {
            if(arr[i]==num) {
                return i;
            }

        }
        return -1;
    }
    public static int countMultiplesOf(int []arr,int num) {
        int count = 0;
        for(int i = 0;i<arr.length;i++) {
            if(isMultiple(arr[i],num) == true) {
                count++;
            }
        }
        return count;
    }
    public static boolean isMultiple(int arrNum,int num) {
        if(arrNum%num==0)
            return true;
        else
            return false;
    }
}