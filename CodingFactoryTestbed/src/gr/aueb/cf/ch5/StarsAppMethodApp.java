package gr.aueb.cf.ch5;

import java.util.Scanner;

public class StarsAppMethodApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n , choice ;

        while (true) {
            choice = printMenu();

            if (!isChoiceValid(choice)) {
                System.out.println("Λάθος επιλογή.Η επιλογή πρέπει να είναι ανάμεσα στο 1 και στο 6.");
                continue;
            }

            switch (choice) {
                case 1 -> {
                    n = getStars();
                    horizontalStars(n);
                }
                case 2 -> {
                    n = getStars();
                    verticalStars(n);
                }
                case 3 -> {
                    n = getStars();
                    tableStars(n);
                }
                case 4 -> {
                    n = getStars();
                    ascStars(n);
                }
                case 5 -> {
                    n = getStars();
                    descStars(n);
                }
                case 6 -> {
                    System.out.println("Επιλέξατε έξοδο.Καλή συνέχεια");
                    System.exit(1);
                }

            }
        }
    }

    public static int printMenu(){
        System.out.println();
        System.out.println("Καλώς ορίσατε στην εφαρμογή!");
        System.out.println();
        System.out.println("1.Εμφάνισε n οριζόντια αστεράκια");
        System.out.println("2.Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3.Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4.Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5.Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6.Έξοδος από το πρόγραμμα");
        System.out.println();
        System.out.println("Παρακαλώ επιλέξτε");
        return scanner.nextInt();
    }

    public static int getStars(){
        System.out.println("Παρακαλώ δώστε αριθμό για αστεράκια");
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {return (choice >= 1 && choice <=6);}

    public static void horizontalStars(int n) {
        for (int i = 1 ; i <= n ; i++) System.out.print('*');
        System.out.println();
    }

    public static void verticalStars(int n) {
        for (int i = 1 ; i <= n ; i++){
            System.out.println('*');
        }
    }

    public static void tableStars(int n) {
        for (int i = 1 ; i <= n ; i++) {
            for (int j = 1 ; j <= n ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void ascStars(int n) {
        for (int i = 1 ; i <= n ; i ++) {
            for (int j = 1 ; j <= i ; j ++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void descStars(int n) {
        for (int i = n ; i > 0  ; i --) {
            for (int j = 1 ; j <= i ; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

}