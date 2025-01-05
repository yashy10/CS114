import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class yashy {
    public static void main(String[] args) {

        try{
            File file = new File("yash.txt")

            PrintWriter writer = new PrintWriter(file);
            writer.println("Hello World");
            writer.println("Wassup dawgs");
            writer.close();
            System.out.println("Used PrintWriter to create text in file");

            Scanner input = new Scanner(file);
            while (input.hasNextLine()){
                System.out.println(input.nextLine());
            }

        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
