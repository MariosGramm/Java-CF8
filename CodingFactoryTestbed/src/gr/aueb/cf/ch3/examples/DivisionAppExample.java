package gr.aueb.cf.ch3.examples;

import java.util.Scanner;

public class DivisionAppExample {

    public static void main(String[] args) {
        int denominator = 0 , numerator = 0 , result = 0 ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε παρονομαστή και αριθμητή : ");
        numerator = sc.nextInt();
        denominator = sc.nextInt();

        while (true) {
            if (denominator == 0) {
                System.out.println("Ο παρονομαστής δεν μπορεί να είναι 0.Εισάγετε ξανά παρονομαστή");
                denominator = sc.nextInt();
            } else break;
        }

        result = numerator / denominator ;

        System.out.printf("The result of %d / %d is %d", numerator , denominator , result);


        }
    }

