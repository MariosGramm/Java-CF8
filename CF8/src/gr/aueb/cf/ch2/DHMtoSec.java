package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

public class DHMtoSec {

    public static void main(String[] args) {

        final int SEC_PER_DAY = 3600 * 24;
        final int SEC_PER_HOUR = 3600 ;
        final int SEC_PER_MIN = 60 ;
        Scanner sc = new Scanner(System.in);
        long days,hours,mins,seconds;
        long totalSecs;

        System.out.println("Παρακαλώ δώστε μέρες , ώρες , λεπτά και δευτερόλεπτα: ");
        days = sc.nextLong();
        hours = sc.nextLong();
        mins = sc.nextLong();
        seconds = sc.nextLong();

        totalSecs = (days*SEC_PER_DAY) + (hours*SEC_PER_HOUR) + (mins*SEC_PER_MIN) + seconds;

        System.out.printf(Locale.US,"Τα συνολικά δευτερόλεπτα είναι : %,d",totalSecs);

    }
}
