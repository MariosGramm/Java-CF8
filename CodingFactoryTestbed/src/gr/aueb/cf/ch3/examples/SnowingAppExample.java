package gr.aueb.cf.ch3.examples;

import java.util.Scanner;

public class SnowingAppExample {

    public static void main(String[] args) {
        boolean isSnowing = false , isRaining = false ;
        double temp ;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Εισάγετε την θερμοκρασία σε βαθμούς Κελσίου: ");
        temp = sc.nextDouble();

        System.out.println("Εισάγετε αν βρέχει (true/false): ");
        isRaining = sc.nextBoolean();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Snowing: " + isSnowing);

    }
}
