package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Θα εκφράζουμε την λογική του if - then - else με linear τρόπο ελέγχοντας στην αρχή του κώδικα τα failure/error conditions.
 */

public class SecretFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        final int SECRET_KEY = 12 ;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο" );
        num = sc.nextInt() ;

        if (num != SECRET_KEY) {
            System.out.println("Secret not found");
            System.exit(1);
        }

        System.out.println("Secret was valid.");
    }
}
