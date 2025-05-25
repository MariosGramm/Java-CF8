package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει εξακολουθητικά ένα menu επιλογών μέχρι ο χρήστης να δώσει exit.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0 ;
        final int EXIT = 3 ;


        do {
            System.out.println("Κάντε μία επιλογή:");
            System.out.println("1.Add Product");
            System.out.println("2.Delete Product");
            System.out.println(("3.Exit "));
            choice = sc.nextInt();

        } while (choice != EXIT);

        System.out.println("Thank you!");
    }
}
