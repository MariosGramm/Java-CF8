package gr.aueb.cf.ch3.examples;

import java.util.Scanner;

public class SecretKeyFinderExample {

    public static void main(String[] args) {
        int inputNum = 0 ;
        Scanner sc = new Scanner(System.in);
        final int SECRET_KEY = 8 ;

        System.out.println("Παρακαλώ εισάγετε αριθμό : ");
        inputNum = sc.nextInt();

        if (inputNum != SECRET_KEY ) {
            System.out.println("Failure");
            System.exit(1);
        }

        System.out.println("Success!");
    }
}
