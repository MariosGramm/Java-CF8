package gr.aueb.cf.ch4.examples;

import java.util.Scanner;

public class GradesAppExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade ;

        System.out.println("Παρακαλώ δώστε τον βαθμό");
        grade = sc.nextInt();

        switch(grade) {
            case 1 :
            case 2 :
            case 3 :
            case 4 :
                System.out.println("Αποτυχία");
                break ;
            case 5 :
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Πολύ καλά");
                break;
            case 9 :
            case 10 :
                System.out.println("Άριστα");
                break ;
            default:
                System.out.println("Ο βαθμός πρέπει να είναι ανάμεσα από το 1 έως το 10");
                break;
        }
    }
}
