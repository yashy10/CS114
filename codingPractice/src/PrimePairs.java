import java.util.ArrayList;

public class PrimePairs {
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();
        int i = 2;
        while(i < 1000) {
            if(isPrime(i)) {
                primes.add(i);
            }
            i++;
        }
        for(int m = 0; m < primes.size() - 1; m++)
            if(primes.get(m + 1) - primes.get(m) == 2)
            System.out.println("(" + primes.get(m) + ", " + primes.get(m + 1) +")");
    }
    public static boolean isPrime(int x) {
        boolean check = true;
        int i = 1;
        for(int j = 2; j <= x/2; j++) {
            if(x % j == 0) i++;
            if(i == 2)
                return false;
        }
        return check; }
}