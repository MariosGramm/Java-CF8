package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εισαγωγή βαθμού από 1 - 10 και το πρόγραμμα εμφανίζει κατάλληλο μήνυμα με modern switch
 */

public class GradeWithModernSwitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade ;

        System.out.println("Παρακαλώ εισάγετε τον βαθμό");
        grade = sc.nextInt();

        switch (grade) {
            case 1 , 2 , 3 , 4 -> System.out.println("Αποτυχία");
            case 5 , 6 -> System.out.println("Καλώς");
            case 7 , 8 -> System.out.println("Πολύ Καλά");
            case 9 , 10 -> System.out.println("Άριστα");
            default -> System.out.println("Λάθος βαθμός");
        }
    }
}
