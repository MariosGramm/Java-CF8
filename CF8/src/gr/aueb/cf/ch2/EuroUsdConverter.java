package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει από τον χρήστη ένα ποσό σε Ευρώ και μετατρέπει σε USD και cents , όπου η ισοτιμία είναι 99 USD Cents = 1 Euro
 */

public class EuroUsdConverter {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        int inputEuros = 0 ;
        int totalUsdCents = 0 ;
        int usaDollars = 0 ;
        int usaCents = 0 ;
        final int PARITY = 99 ;
        Scanner in = new Scanner(System.in);

        //Εντολές
        System.out.println("Παρακαλω εισάγετε ένα ποσό σε ευρώ(ακέραιο)");
        inputEuros = in.nextInt();
        totalUsdCents = inputEuros * 99 ; //magic number
        usaDollars = totalUsdCents / 100 ;
        usaCents = totalUsdCents % 100;

        System.out.printf("%d \u20AC = %d \u0024 , %d USA cents", inputEuros , usaDollars , usaCents);
    }
}
