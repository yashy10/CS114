package Summation;


public class Main {
    public static void main(String[] args) {

        double result = 0;

        for (double i=1; i < 98; i +=2){
            double bottomResult = i + 2 ;
            result += (i / bottomResult);
        }
        System.out.println(result);
    }
}