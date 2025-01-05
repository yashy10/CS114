import java.util.Scanner;
public class Problem {
    public static void main(String[] args) {
        int x, y;
        Scanner stdin = new Scanner(System.in);
        System.out.println("enter the value of x:->");
        x = stdin.nextInt();
        System.out.println("enter the value of y:->");
        y = stdin.nextInt();
        stdin.close();
        try {
            System.out.println(x);
            System.out.println(x/y);
            System.out.println(y);
        }
        catch(Exception ex) {
            System.out.println(" An exception !");
        }
        finally {
            System.out.println("Finally block executing !");
        }
        System.out.println("Last statement of the program !");
    }
}