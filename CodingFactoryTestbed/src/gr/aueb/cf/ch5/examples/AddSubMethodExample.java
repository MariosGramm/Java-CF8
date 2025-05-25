package gr.aueb.cf.ch5.examples;

import java.util.Scanner;

public class AddSubMethodExample {

    public static void main(String[] args) {
        int num1 , num2 , sum , sub ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ δώστε 2 αριθμούς :");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = AddSubMethodExample.add(num1,num2);
        sub = AddSubMethodExample.sub(num1,num2);

        System.out.println("Άθροισμα : " + sum + " Υπόλοιπο : " + sub);

    }


    public static int add(int a, int b) {return a + b;}

    public static int sub(int a , int b) {return a - b;}
}



