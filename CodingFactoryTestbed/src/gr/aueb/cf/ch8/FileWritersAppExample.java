package gr.aueb.cf.ch8;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;

public class FileWritersAppExample {

    public static void main(String[] args) {
        File file = new File("C:/Apps/text-writers.txt");

        try {
            filewriter(file);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            bufferedwriter(file);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try {
            printstream(file);
        }catch (IOException e ) {
            System.out.println(e.getMessage());
        }


    }

    public static void filewriter(File file) throws IOException {
        try(FileWriter fw = new FileWriter(file)) {
            fw.write("Writing with FileWriter");
            fw.write("\n");
            fw.write("This is the next line");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e ;
        }
    }

    public static void bufferedwriter(File file) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("Writing with BufferedWriter");
            bw.newLine();
            bw.write("This is the next line");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
            throw e ;
        }
    }

    public static void printstream(File file) throws FileNotFoundException {
        try (PrintStream ps = new PrintStream(new FileOutputStream(file , true) , false, StandardCharsets.UTF_8)){
            ps.println("Writing with printstream!!");
            ps.print("This is the next line");
            ps.flush();
        } catch (IOException e ) {
            e.printStackTrace();
            throw e ;
        }
    }
}
