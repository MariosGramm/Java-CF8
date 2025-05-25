package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * υπολογίζει την δύναμη a ^n
 */
public class PowerApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a , n ;

        a = getBase();
        n = getPower();

        System.out.println("Το αποτέλεσμα της δύναμης είναι : " + getResult(a ,n));

    }

    public static int getBase() {
        System.out.println("Παρακαλώ δώστε την βάση");
        return scanner.nextInt();
    }

    public static int getPower() {
        System.out.println("Παρακαλώ δώστε την δύναμη");
        return scanner.nextInt();
    }

    public static long getResult(int base , int power) {
//        int result = 1 ;
//
//        for (int i = 1 ; i <= power ; i++) result *= base;
//        return result;

        return (long)Math.pow(base , power);
    }


}
