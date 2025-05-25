package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * πρόγραμμα που διαβάζει από τον χρήστη 3 ακέραιους αριθμούς που αναπαριστούν ημέρα, μήνα, έτος και την εμφανίζει σε μορφή
 * ΗΗ/ΜΜ/ΕΕ
 */

public class DateApp {

    public static void main(String[] args) {

        int day , month , year ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε ημέρα , μήνα και έτος: ");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        System.out.printf("Η ημερομηνία είναι : %02d/%02d/%02d", day , month , year % 100);
    }
}
