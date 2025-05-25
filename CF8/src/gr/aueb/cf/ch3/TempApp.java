package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει μία θερμοκρασία από τον χρήστη  και εμφανλιζει κατάλληλο μήνυμα αν η θερμοκρασία είναι κάτω από το 0
 */
public class TempApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0 ;
        boolean isBelowZero = false ;

        System.out.println("Παρακαλώ εισάγετε μία θερμοκρασία: ");
        temp = sc.nextInt();

        isBelowZero = temp < 0 ;

        System.out.println("Η θερμοκρασία είναι κάτω από το μηδέν: " + isBelowZero);
    }
}
