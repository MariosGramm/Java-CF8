package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογισμός πλήθους και αθροίσματος των ψηφίων.
 */

public class DigitCountAndSum {

    public static void main(String[] args) {
        int num = 0 , dcount = 0 , dsum = 0 , digit = 0 , tempNum = 0 ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε έναν αριθμό : ");
        num = sc.nextInt();
        tempNum = num ;

        while (tempNum > 0) {
            digit = tempNum % 10;
            dcount++;
            dsum += digit;
            tempNum /= 10;
        }
        System.out.printf("Δώσατε τον αριθμό %d " , num);
        System.out.printf("Digit count : %d , Digit sum : %d" , dcount , dsum);



        }

    }

