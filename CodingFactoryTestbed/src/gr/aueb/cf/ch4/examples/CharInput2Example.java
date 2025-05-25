package gr.aueb.cf.ch4.examples;

import java.util.Scanner;

/**
 * Διαβάζει τον char με scanner
 */

public class CharInput2Example {

    public static void main(String[] args) {
        char inputChar ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ δώστε έναν χαρακτήρα");
        inputChar = sc.nextLine().charAt(0);    //πρώτη θέση της γραμμής

        System.out.println(inputChar);


    }
}
