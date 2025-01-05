public class RecursionExample {
    // Method to calculate factorial using recursion
    public static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }
    public static int fibbonaci(int n){
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibbonaci(n-1) + fibbonaci(n-2);
    }
    public static int reverse(int n) {
        if(n<10){
            return n;
        }
        return (n%10)+(n/10);
    }
    public static String reverseString(String str){
        if(str.isEmpty()){
            return str;
        }
        return reverseString(str.substring(1) + str.charAt(0));
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of " + number + " is: " + factorial(number));
        int term = 6;
        System.out.println("Fibbonaci: " + fibbonaci(term));
        int reversable = 102;
        System.out.println(reverse(reversable));
    }
}
