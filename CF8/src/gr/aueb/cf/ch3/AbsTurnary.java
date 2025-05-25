package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει το απόλυτο ενός ακεραίου με την χρήση τριαδικού τελεστή.
 */

public class AbsTurnary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int abs;

        System.out.println("Παρακαλώ εισάγετε 1 ακέραιο");
        num1 = sc.nextInt();

        abs = (num1 >= 0 ) ? num1:-num1; //turnary

        System.out.println(abs);
    }
}
