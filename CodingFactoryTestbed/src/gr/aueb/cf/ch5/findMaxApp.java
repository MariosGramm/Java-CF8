package gr.aueb.cf.ch5;

import java.util.Scanner;

public class findMaxApp {

    public static void main(String[] args) {
        int num1 , num2 , num3 , max ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε 3 αριθμούς");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        max = findMax(num1 , num2 , num3);

        System.out.printf("Ο μεγαλύτερος αριθμός εκ των %d , %d , %d είναι ο %d" , num1 , num2 , num3 , max);


    }

    public static int findMax(int a , int b , int c ) {
        return Math.max(Math.max(a , b) , c);
    }
}
