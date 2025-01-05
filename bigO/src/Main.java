

public class Main {

    public static void printItems(int n){

        for (int i = 0; i < n; i++){
            for (int x = 0; x < n; x++){
                System.out.println(i + " " + x);
            }
        }
        for (int k = 0; k < n; k++){
            System.out.println(k);
        }
    }



    public static void main(String[] args) {

        printItems(10);//Big O complexity of O(n) - no constants in big O

    }
}