package gr.aueb.cf.ch3.examples;

import java.util.Scanner;

public class AbsTurnaryExample {

    public static void main(String[] args) {
        int num = 0 ;
        int abs ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Εισάγετε μία τιμή: ");
        num = sc.nextInt();

        abs = (num >= 0 ) ? num : - num;

        System.out.println(abs);
    }
}
