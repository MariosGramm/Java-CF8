package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

public class FileWritersApp {

    public static void main(String[] args) throws IOException {
        File fd = new File("C:/Apps/file-writer.txt");

        try {
            fileWriter(fd);
        } catch (IOException e) {
            System.out.println("Το αρχείο δεν δημιουργήθηκε");
        }
        try {
            PrintStream ps = new PrintStream("C:/tmp/test.txt", StandardCharsets.UTF_8);
            sayHello(ps);
            sayHello(System.out);

        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }

    public static void fileWriter (File file) throws IOException {
        try (FileWriter fw = new FileWriter(file,true)) {
            fw.write("Coding");
            fw.flush();

        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e ;
        }
    }

    public static void bufferedWriter(File file) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
            bw.write("Coding");
            bw.newLine();
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e ;
        }
    }

    public static void printstream(String file) throws IOException {
        try (PrintStream ps = new PrintStream(new FileOutputStream(file, true), false, StandardCharsets.UTF_8)) {
            ps.println("Printing with printstream");
            ps.flush();     //παρόλο που έχει auto - flush
        } catch (IOException e) {
            System.out.println(LocalDateTime.now() + "\n" + e);
            throw e ;
        }

    }

    public static void sayHello(PrintStream ps) {
        ps.println("Hello CF !");
    }
}
