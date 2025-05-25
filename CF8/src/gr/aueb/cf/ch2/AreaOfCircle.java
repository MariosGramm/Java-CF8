package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Υπολογίζει το εμβαδόν ενός κύκλου
 */

public class AreaOfCircle {

    public static void main(String[] args) {
        int radius = 0 ;
        double circleArea = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε την ακτίνα του κύκλου : ");
        radius = sc.nextInt();
        circleArea = Math.PI * Math.pow(radius,2);

        System.out.printf("The area of the circle with radius %d is %.2f", radius , circleArea);
    }
}
