package lab9;

public class commuteSummation {

    public static void main(String[] args) {

        System.out.println("i\tm(i)");
        for(int i = 1;i<=20;i++) {

            System.out.printf(i + "\t" + "%.4f\n",summation(i) );
        }
    }
    public static double summation(int i) {

        double sum = 0;

        for(double x = 1;x<=i;x++)
        {
            sum += x/(x+1);
        }
        return sum;
    }
}
