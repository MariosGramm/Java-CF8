package gr.aueb.cf.ch4.examples;

import java.io.IOException;


/**
 * Διαβάζει έναν char με read
 */

public class CharInput1Example {

    public static void main(String[] args) throws IOException {


        System.out.println("Παρακαλώ δώστε έναν χαρακτήρα: ");
        int inputChar = System.in.read();


        System.out.println((char)inputChar);

    }
}



