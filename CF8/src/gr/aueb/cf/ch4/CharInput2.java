package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * scanner
 */


public class CharInput2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inputChar ;

        System.out.println("Δώστε έναν χαρακτήρα");
        inputChar = sc.nextLine().charAt(0);
        System.out.println("Input char: " + inputChar);
    }
}
