package gr.aueb.cf.ch2;

import java.util.Scanner ;

/**
 * Μετατρέπει την ηλικία του χρήστη από έτη σε μέρες
 */
public class YearsToDays {

    public static void main(String[] args) {
        int InputAge = 0 , DaysAge = 0 ;
        final int DAYS_PER_YEAR = 365;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε την ηλικία σας σε χρόνια(ακέραιος αριθμός): ");
        InputAge = sc.nextInt();

        DaysAge = InputAge * DAYS_PER_YEAR ;

        System.out.printf("Η ηλικία σας (%d) σε ημέρες είναι : %d ημέρες" , InputAge , DaysAge);

    }
}
