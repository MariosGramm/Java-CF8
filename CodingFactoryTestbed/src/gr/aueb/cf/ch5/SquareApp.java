package gr.aueb.cf.ch5;

import java.util.Scanner;

public class SquareApp {

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο αριθμό");
        num = scanner.nextInt();

        System.out.println("Το τετράγωνο του " + num + " είναι " + square(num));

    }

    public static int square(int num) {return num*num;}
}
