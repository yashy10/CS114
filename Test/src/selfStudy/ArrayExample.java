package selfStudy;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args){

        int[] smallPrimes = {2,3,5,7,11,13};
        int[] bigInts = {1001,1002,1003,1004,1005,1006,1007};
        System.arraycopy(smallPrimes, 2, bigInts , 3,4);

        for (int i = 0; i< bigInts.length; i++){
            System.out.println(i + "' th entry after copy is " + bigInts [ i]);
        }
        System.out.println((Arrays.toString(bigInts)));

    }
}
