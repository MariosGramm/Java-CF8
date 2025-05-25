package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Παρέχονται ακέραιοι αριθμοί από το standard input μέχρι να βρεθεί το -1 (sentinel)
 */

public class SentinelApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0 ;
        int iterations = 0 ;

        System.out.println("Παρακαλώ εισάγετε έναν αριθμό :");
        num = sc.nextInt();

        while (num != -1){
            iterations++ ;
            System.out.println("Παρακαλώ δώστε τον επόμενο αριθμό");
            num = sc.nextInt();
        }

        System.out.printf("%d επαναλήψεις" , iterations);
    }
}
