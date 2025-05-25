package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογιστής τσέπης
 */

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice ;
        int result ;

        while (true) {
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Λάθος επιλογή.Η επιλογή πρέπει να είναι ανάμεσα στο 1 και στο 6 . Προσπαθήστε ξανά.");

            }

            if (isExit(choice)){
                System.out.println("Έξοδος....");
                break;
            }

            result = getResultBasedOnChoice(choice);
            printTheResultToStdOut(result);
        }


    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1.Πρόσθεση");
        System.out.println("2.Αφαίρεση");
        System.out.println("3.Πολλαπλασιασμός");
        System.out.println("4.Διαίρεση");
        System.out.println("5.Υπόλοιπο Διαίρεσης");
        System.out.println("6.Έξοδος");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 6 ;

    }

    public static boolean isExit(int choice) {
        return choice == 6;
    }

    public static int getResultBasedOnChoice(int choice) {
        int a , b ;
       // int result = 0 ;

        System.out.println("Παρακαλώ δώστε 2 ακεραίους");
        a = scanner.nextInt();
        b = scanner.nextInt();

        return switch(choice) {
            case 1 -> add(a , b);
            case 2 -> sub(a , b);
            case 3 -> mul(a , b);
            case 4 -> div(a , b);
            case 5 -> mod(a , b);
            default -> 0;
        };



//        result =  switch (choice) {
//            case 1 -> {
//                yield a + b;
//            }
//            case 2 -> {
//                yield a - b;
//            }
//            case 3 -> {
//                yield a * b;
//            }
//            case 4 -> {
//                if (b == 0) yield 0 ;
//                yield a % b ;
//            }
//            case 5 -> {
//                if (b == 0) yield 0 ;
//                yield a % b
//            }
//            default -> 0;
//
//        };
    }

    public static int add(int a , int b) {
        return a + b ;
    }

    public static int sub(int a , int b) {
        return a - b ;
    }

    public static int mul(int a , int b) {
        return a * b ;
    }

    public static int div(int a , int b) {
//        if (b == 0 ) return 0 ;
//        return a / b ;
        return (b == 0) ? 0 : a / b ;
    }

    public static int mod(int a , int b) {
        return (b == 0) ? 0 : a % b ;
    }

    public static void printTheResultToStdOut(int result) {
        System.out.println("Το αποτέλεσμα είναι: " + result);
    }
}
