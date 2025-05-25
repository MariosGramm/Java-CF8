package gr.aueb.cf.ch3.examples;

import java.util.Scanner;

public class MinValueExample {

    public static void main(String[] args) {
        int num1 = 0 , num2 = 0 ;
        int min;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε 2 ακεραίους : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        min = (num1 < num2) ? num1 : num2 ;

        System.out.println(min);

    }
}
