package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * εμφανίζει ένα menu με την χρήση μεθόδων
 */

public class MenuApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice ;

        do {
            printMenu();
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Επιτυχής εισαγωγή");
                case 2 -> System.out.println("Επιτυχής διαγραφή");
                case 3 -> System.out.println("Επιτυχής ενημέρωση");
                case 4 -> System.out.println("Επιτυχής αναζήτηση");
                case 5 -> System.out.println("Επιτυχής έξοδος");
                default -> System.out.println("Λάθος επιλογή");
            }

        } while (choice != 5);
    }

    public static void printMenu() {
        System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1.Εισαγωγή");
        System.out.println("2.Διαγραφή");
        System.out.println("3.Ενημέρωση");
        System.out.println("4.Αναζήτηση");
        System.out.println("5.Έξοδος");
    }

}
