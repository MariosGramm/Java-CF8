package gr.aueb.cf.ch4;

import java.util.Scanner;

public class DaysApp {

    public static void main(String[] args) {
        int choice ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ δώστε μία τιμή από το 1 έως το 7");
        choice = scanner.nextInt();

        while (choice < 1 || choice > 7) {
            System.out.println("Η τιμή πρέπει να είναι ανάμεσα στο 1 και στο 7.Ξαναπροσπαθήστε");
            choice = scanner.nextInt();
        }

        switch (choice){
            case 1 -> System.out.println("Δευτέρα");
            case 2 -> System.out.println("Τρίτη");
            case 3 -> System.out.println("Τετάρτη");
            case 4 -> System.out.println("Πέμπτη");
            case 5 -> System.out.println("Παρασκευή");
            case 6 -> System.out.println("Σάββατο");
            case 7 -> System.out.println("Κυριακή");
        }
    }
}
