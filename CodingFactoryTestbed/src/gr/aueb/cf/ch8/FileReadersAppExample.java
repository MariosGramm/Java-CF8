package gr.aueb.cf.ch8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Scanner;

public class FileReadersAppExample {

    public static void main(String[] args) {
        File inputFile = new File("C:\\JavaPracticeFiles\\locations.txt");

        try{
            bufferedReaderMethod(inputFile);
        }catch (IOException e) {
            System.out.println("Υπάρχει πρόβλημα με το διάβασμα του αρχείου");
        }

    }

    public static void filereader(File file) throws IOException{
        try (FileReader fr = new FileReader(file)){
            int ch ;

            while ((ch = fr.read()) != -1 ) {
                System.out.print((char)ch);
            }
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e ;
        }
    }

    public static void scannerMethod(File file) throws IOException{
        try (Scanner sc = new Scanner(file , StandardCharsets.UTF_8)) {
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw e ;
        }
    }

    public static void bufferedReaderMethod(File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),StandardCharsets.UTF_8))){
            String line ;

            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
            throw e ;
        }
    }
}
