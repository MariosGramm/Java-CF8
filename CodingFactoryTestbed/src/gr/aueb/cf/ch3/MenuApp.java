package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει επαναληπτικά ένα μενού με
 * επιλογές, το οποίο να επαναλαμβάνεται μέχρι ο χρήστης να
 * δώσει τον αριθμό 5.
 */

public class MenuApp {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("Καλώς ορίσατε στην εφαρμογή!");
        System.out.println(" ");
        System.out.println("1.Εισαγωγή");
        System.out.println("2.Διαγραφή");
        System.out.println("3.Ενημέρωση");
        System.out.println("4.Αναζήτηση");
        System.out.println("5.Έξοδος");
        System.out.println(" ");

        System.out.println("Επιλέξτε έναν αριθμό από το 1 έως και το 5 ");
        choice = sc.nextInt();

        while ((choice < 1) || (choice > 5)) {
            System.out.println("Ο αριθμός πρέπει να είναι ανάμεσα στο 1 και στο 5.Ξαναπροσπαθήστε.");
            choice = sc.nextInt();
        }

        while (true) {
            if (choice == 1) {
                System.out.println("Επιλέξατε εισαγωγή.Επιλέξτε έναν αριθμό από το 1 έως και το 5 ");
                choice = sc.nextInt();
            }
            else if (choice == 2){
                System.out.println("Επιλέξατε διαγραφή.Επιλέξτε έναν αριθμό από το 1 έως και το 5");
                choice = sc.nextInt();
            }
            else if (choice == 3){
                System.out.println("Επιλέξατε ενημέρωση.Επιλέξτε έναν αριθμό από το 1 έως και το 5");
                choice = sc.nextInt();
            }
            else if (choice == 4){
                System.out.println("Επιλέξατε αναζήτηση.Επιλέξτε έναν αριθμό από το 1 έως και το 5");
                choice = sc.nextInt();
            }
            else {
                System.out.println("Επιλέξατε έξοδο.Καλή συνέχεια");
                System.exit(1);
            }
        }
    }
    }
