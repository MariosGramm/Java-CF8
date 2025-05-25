package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει για πάντα και όταν βρει τον sentinel διακόπτει το loop.
 */

public class SentinelApp3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0 ;
        int iterations = 0 ;

        while (true) {

            System.out.println("Παρακαλώ εισάγετε τον επόμενο ακέραιο ( -1 για έξοδο )");
            num = sc.nextInt();
            if (num == -1) {
                break;
            }
            iterations ++;

        }

        System.out.printf("%d επαναλήψεις" , iterations);
    }
}

