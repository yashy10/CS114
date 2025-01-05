
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Account a1 = new Account(116203702, 100, 0.65);
        System.out.println(a1.widthdraw(30) + " " + a1.getBalance());


    }
}