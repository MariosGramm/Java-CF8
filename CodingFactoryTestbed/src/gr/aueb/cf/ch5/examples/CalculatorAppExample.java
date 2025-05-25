package gr.aueb.cf.ch5.examples;

import java.util.Scanner;

public class CalculatorAppExample {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice , result ;

        while (true){
            printMenu();
            choice = getChoice();

            if (!isChoiceValid(choice)){
                System.out.println("Λάθος επιλογή , προσπαθήστε ξανά.");
            }



            if (isExit(choice)){
                System.out.println("Έξοδος.");
                break;
            }

            result = getResult(choice);
            System.out.println(result);




        }


    }

    public static void printMenu(){
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1.Πρόσθεση");
        System.out.println("2.Αφαίρεση");
        System.out.println("3.Πολλαπλασιασμός");
        System.out.println("4.Διαίρεση");
        System.out.println("5.Υπόλοιπο Διαίρεσης");
        System.out.println("6.Έξοδος");
    }

    public static int getChoice() { return scanner.nextInt();}

    public static boolean isChoiceValid(int choice) {return choice >= 1 && choice <= 6 ;}

    public static int getResult(int choice) {
        int result ;
        int num1 ;
        int num2 ;

        System.out.println("Παρακαλώ εισάγετε 2 αριθμούς: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        return switch (choice) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            case 4 -> num1 / num2;
            case 5 -> num1 % num2;
            default -> 0;
        };


    }

    public static boolean isExit(int choice) {return choice == 6;}
}
