package gr.aueb.cf.ch3.examples;

import java.util.Scanner;

public class DigitCountSumExample {

    public static void main(String[] args) {
        int num , digit , dcount = 0 , dsum = 0 ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Εισάγετε έναν αριθμό: ");
        num = sc.nextInt();

        while ( num > 0) {
            digit = num % 10 ;
            dcount++;
            dsum += digit;
            num /= 10;
        }

        System.out.printf("Digits Count : %d , Digits Sum : %d ", dcount , dsum);
    }
}
