package gr.aueb.cf.ch3.examples;

import java.util.Scanner;

public class TempAppExample {

    public static void main(String[] args) {
        double temp ;
        boolean isBelowZero = false ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε θερμοκρασία σε βαθμούς Κελσίου ");
        temp = sc.nextDouble();

        isBelowZero = temp < 0 ;

        System.out.println("The temperature is below zero : " + isBelowZero);
    }
}
