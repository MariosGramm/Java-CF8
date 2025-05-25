package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Aποφαίνεται αν ένα έτος είναι δίσεκτο ή όχι.
 */

public class LeapYearApp {

    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε ένα έτος: ");
        year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Year " + year + " is a leap year.");
        } else {
            System.out.println("Year " + year + " is not a leap year.");
        }

    }
}

