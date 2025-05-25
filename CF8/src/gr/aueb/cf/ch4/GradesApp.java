package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εισαγωγή βαθμού από 1 - 10 και το πρόγραμμα εμφανίζει κατάλληλο μήνυμα
 */

public class GradesApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade ;

        System.out.println("Δώστε βαθμό");
        grade = sc.nextInt();

        switch (grade){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
                System.out.println("Αποτυχία");
                break;
            case 5 :
            case 6 :
                System.out.println("Καλώς");
                break;
            case 7 :
            case 8 :
                System.out.println("Πολύ καλά");
                break;
            case 9 :
            case 10 :
                System.out.println("Άριστα");
                break;
            default:
                System.out.println("Ο αριθμός έπρεπε να είναι 1 -10");
                break;
        }
    }
}
