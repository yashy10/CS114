public class PentagonalNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++){
            System.out.println(getPentagonalNumber(i));
        }
    }
    public static int getPentagonalNumber(int n) {
        return n*(3*n - 1)/2;
    }
}