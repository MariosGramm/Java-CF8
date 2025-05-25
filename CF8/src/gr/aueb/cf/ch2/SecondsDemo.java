package gr.aueb.cf.ch2;

import java.util.Scanner;

public class SecondsDemo {

    public static void main(String[] args) {
        final int DAY = 3600 * 24 ;
        final int HOUR = 3600;
        final int MINUTE = 60 ;
        int inputSeconds = 0 ;
        int remainingSeconds = 0 ;
        int days , minutes , hours = 0 ;

        Scanner in = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε τα δευτερόλεπτα: ");
        inputSeconds = in.nextInt();
        remainingSeconds = inputSeconds;

        days = remainingSeconds / DAY;
        remainingSeconds = remainingSeconds % DAY;

        hours = remainingSeconds /HOUR ;
        remainingSeconds = remainingSeconds % HOUR;

        minutes = remainingSeconds /MINUTE ;
        remainingSeconds = remainingSeconds % MINUTE ;

        System.out.printf("Input seconds : %d = Days : %d , Hours : %d , Minutes : %d , Seconds : %d", inputSeconds , days , hours , minutes, remainingSeconds);



    }
}
