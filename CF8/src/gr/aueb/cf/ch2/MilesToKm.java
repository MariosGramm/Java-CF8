package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει μίλια σε χιλιόμετρα όπου 1 m = 1.6 km .
 */

public class MilesToKm {

    public static void main(String[] args) {

        double mil,km;
        final double KM_PER_MILE = 1.6;     //Magic Number
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε τα μίλια: ");
        mil = sc.nextDouble();

        km = mil * KM_PER_MILE ;

        System.out.println("Miles: " + mil + " mil" + " Kilometers: " + km + " km" );


    }
}
