package gr.aueb.cf.ch2;

import java.util.Scanner;

public class MaxOfThree {

    public static void main(String[] args) {

        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Εισάγετε 3 αριθμούς: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        System.out.printf("Ο μέγιστος εκ των %d , %d και %d είναι: %d", num1 , num2 , num3 , Math.max(Math.max(num1 , num2) , num3));
    }
}
