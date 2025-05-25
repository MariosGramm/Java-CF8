package gr.aueb.cf.ch2;
/**
 * Διαβάζει μια θερμοκρασία σε βαθμούς Fahrenheit και την μετατρέπει σε βαθμούς Celsius
 */

import java.util.Scanner;

public class FahrenheitApp {

    public static void main(String[] args) {

        int F ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε την ακέραια θερμοκρασία σε βαθμούς Fahrenheit: ");
        F = sc.nextInt();

        System.out.printf("Η θερμοκρασία σε βαθμούς Celsius είναι %d", (5*(F-32) / 9 ));

    }
}
