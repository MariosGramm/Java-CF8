package gr.aueb.cf.ch3;

import java.util.Scanner;
/**
 * ο χρήστης θα δώσει αριθμητή και παρονομαστή , ελέγχει αν ο παρονομαστής είναι 0
 */

public class DivisionApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = 0 ;
        int denominator = 0 ;
        int result = 0;

        while (true) {
            System.out.println("Δώστε αριθμητή ");
            numerator = sc.nextInt();

            System.out.println("Δώστε παρονομαστή ");
            denominator = sc.nextInt();


            if (denominator == 0) {
                System.out.println("Ο παρονομαστής δεν πρέπει να είναι μηδέν.");
                //break;
                continue;

            }

            result = numerator / denominator;
            System.out.printf("%d , %d , %d", numerator, denominator, result);


        }

    }
}
