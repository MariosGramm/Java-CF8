package gr.aueb.cf.ch8;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class LocationsFile {

    public static void main(String[] args) {

        String inputFilePath = "C:\\JavaPracticeFiles\\locations.txt";
        String outputFilePath = "C:\\JavaPracticeFiles\\locationsFormated.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))){
            PrintStream ps = new PrintStream(outputFilePath , StandardCharsets.UTF_8);

            String line ;
            String[] tokens ;

            while((line = reader.readLine()) != null ) {
                tokens = line.split(",+\\s*");
                ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" }, \n", tokens[0], tokens[1], tokens[2]);
                System.out.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" }, \n", tokens[0], tokens[1], tokens[2]);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file " + e.getMessage());
        }
    }
}
