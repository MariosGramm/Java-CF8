package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Η switch-case χρησιμοποιείται αντί των πολλαπλών if-then-else .
 */

public class SwitchApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Παρακαλώ εισάγετε ένα από τα παρακάτω: ");
        System.out.println("1. One-Player game");
        System.out.println("2. Two-Player game");
        System.out.println("3. Team game");
        System.out.println("4. Exit");

        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("one-player game");
                break;
            case 2 :
                System.out.println("two-player game");
                break;
            case 3:
                System.out.println("Team-player game");
                break;
            case 4 :
                System.out.println("Exit game");
                break;

                default :
                    System.out.println("Wrong choice");
                    break;


        }
    }
}
