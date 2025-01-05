import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class CityFileHandler {

    public static void main(String[] args) {
        String inputFileName = "cities.txt";
        String outputFileName = "output.txt";

        writeCitiesToFile(inputFileName);
        reverseCitiesInFile(inputFileName, outputFileName);
    }

    private static void writeCitiesToFile(String fileName) {
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Dallas", "Houston", "Chicago", "Denver", "Tampa",
                "Miami", "Charlotte", "Austin", "Detroit", "Seattle");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String city : cities) {
                writer.write(city);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void reverseCitiesInFile(String inputFile, String outputFile) {
        ArrayList<String> cities = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String city;
            while ((city = reader.readLine()) != null) {
                cities.add(city);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
            return;
        }

        Collections.reverse(cities);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String city : cities) {
                writer.write(city);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
