import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentance: ");
        String nextString = input.nextLine().toLowerCase();
        String xString = nextString.replace(" ", "");
        //int count = 0;
        //System.out.println("Please enter a target letter: ");
        //char nChar = input.next().charAt(0);
        HashMap<Character, Integer> charMap = new HashMap<>();

        for(int i = 0; i < xString.length(); i++){
            char ch = xString.charAt(i);

            if(Character.isLetter(ch)){
                if(charMap.containsKey(ch)){
                    charMap.put(ch, charMap.get(ch) + 1);
                } else {
                    charMap.put(ch, 1);
                }
            }
        }
        for(char ch = 'a'; ch <='z'; ch++){
            int occurrences = charMap.getOrDefault(ch, 0);
            System.out.println(ch + ": " + occurrences);
        }
    }
}