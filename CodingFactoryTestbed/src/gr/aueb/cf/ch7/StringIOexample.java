package gr.aueb.cf.ch7;

import java.util.Scanner;

public class StringIOexample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε 2 strings");
        String s1 = scanner.nextLine();
        String s2 = scanner.next();

        System.out.println(s1);
        System.out.println(s2);
    }
}
