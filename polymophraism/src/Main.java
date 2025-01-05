import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> zoo = new ArrayList<>();

        zoo.add(new dog());
        zoo.add(new cat());

        for (int i = 0; i < zoo.size(); i++) {
            zoo.get(i).makeSound();
        }

        dog myDog = new dog();
        myDog.bark();

    }
}