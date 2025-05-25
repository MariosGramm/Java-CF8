package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Υπολογίζει την επαυξημένη τιμή με ΦΠΑ που θα εισάγει ο χρήστης.
 */

public class PriceWithVat {

    public static void main(String[] args) {

        double InputPrice = 0.0 , FinalPrice = 0.0 ;
        final double VAT_RATE = 0.24;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε μία τιμή: ");
        InputPrice = sc.nextDouble();

        FinalPrice = InputPrice + (InputPrice * VAT_RATE);

        System.out.printf("Price : %.2f , Price with VAT : %.2f", InputPrice , FinalPrice);
    }
}
