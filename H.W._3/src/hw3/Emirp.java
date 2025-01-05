package hw3;

public class Emirp {

    public static void main(String[] args) {

        int num =10,count = 0;

        while(count<100) {
            if(notPalimdrome(num) && prime(num)) {
                int reverse = reversed(num);

                if (reverse != num && prime(reverse)) {
                    System.out.print(num + " ");
                    count++;
                }
            }
            num++;
        }
    }

    public static boolean notPalimdrome(int n) {

        return n != reversed(n);
    }


    public static boolean prime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static int reversed(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + (n % 10);
            n = n / 10;
        }
        return reversed;
    }

}