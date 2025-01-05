import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> food = new ArrayList<String>();
        ArrayList<String> food2 = new ArrayList<>(Arrays.asList("Pata", "Piza"));

        food.add("Pizza");
        food.add("Pasta");
        food.set(0,"pizza");
        System.out.println(food.get(0));
        System.out.println(food.contains("Pasta"));
        System.out.println(food.indexOf("Pasta"));
        System.out.println(food.lastIndexOf(food));

        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
            System.out.println(food2.get(i));
        }
        food.clear();


    }
}