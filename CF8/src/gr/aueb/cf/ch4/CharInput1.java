package gr.aueb.cf.ch4;

/**
 * read
 */

import java.io.IOException;

public class CharInput1 {

    public static void main(String[] args) throws IOException {
        int inputChar = ' ';

        System.out.println("Παρακαλώ εισάγετε έναν χαρακτήρα");
        inputChar = System.in.read();

        System.out.println("char: " + (char)inputChar);
    }
}


