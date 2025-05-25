package gr.aueb.cf.ch4.examples;

import java.util.Scanner;

public class GradesAppModernSwitchExample {

    public static void main(String[] args) {
        int grade ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ δώστε τον βαθμό");
        grade = sc.nextInt();

        switch(grade) {
            case 1,2,3,4 -> System.out.println("Αποτυχία");
            case 5,6 -> System.out.println("Καλά");
            case 7,8 -> System.out.println("Πολύ καλά");
            case 9,10 -> System.out.println("Άριστα");
            default -> System.out.println("Ο βαθμός πρέπει να είναι από το 1 έως το 10");
        }
    }
}
