package gr.aueb.cf.ch5.examples;

import java.util.Scanner;

public class CalcAppWithMethod {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice ;
        int a , b ;

        while (true) {

            printMenu() ;

            System.out.println("Παρακαλώ εισάγετε την επιλογή σας");
            choice = getOneInt();

            System.out.println("Παρακαλώ εισάγετε δύο ακέραιους αριθμούς");
            a = getOneInt();
            b = getOneInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Λάθος επιλογή");
                continue;
            }

            switch (choice) {
                case 1 -> System.out.printf("To άθροισμα είναι %d\n",add(a,b));
                case 2 -> System.out.printf("Η διαφορά είναι %d\n", sub(a,b));
                case 3 -> System.out.printf("Το γινόμενο είναι %d\n" , mul(a,b));
                case 4 -> System.out.printf("Το πηλίκο είναι %d\n" , div(a,b));
                case 5 -> System.out.printf("Το υπόλοιπο είναι %d\n" , modulo(a,b));
                case 6 -> {
                    System.out.println("Επιλέξατε έξοδο.Καλή συνέχεια");
                    System.exit(1);
                }
            }


        }

    }

    public static void printMenu() {
        System.out.println("Καλώς ορίσατε στην εφαρμογή");
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1.Πρόσθεση");
        System.out.println("2.Αφαίρεση");
        System.out.println("3.Πολλαπλασιασμός");
        System.out.println("4.Διαίρεση");
        System.out.println("5.Υπόλοιπο Διαίρεσης");
        System.out.println("6.Έξοδος");
    }

    public static int getOneInt() {return scanner.nextInt();}

    public static boolean isChoiceValid(int choice) { return  choice >= 1 && choice <= 6;}

    public static int add(int a , int b) {return a + b;}

    public static int sub(int a , int b) {return a - b;}

    public static int mul(int a , int b) {return a * b;}

    public static int div(int a , int b) {
        if (b != 0) {
            return a / b;}
        else {
            System.out.println("Δεν επιτρέπεται ο πολλαπλασιασμός με το μηδέν");
            return 0;
            }
        }


    public static int modulo (int a , int b ) {
        if (b != 0) return a % b;
        System.out.println("Δεν επιτρέπεται ο πολλαπλασιασμός με το μηδέν");
        return 0;
        }
    }





