package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Υπολογίζει το base^power με επαναληπτική for και διαβάζει τα base , power από τον χρήστη
 */

public class PowerApp {

    public static void main(String[] args) {
        int base , power ;
        Scanner sc = new Scanner(System.in);
        BigInteger bigResult = new BigInteger("1");
        int result = 1 ;

        System.out.println("Δώστε την δύναμη και την βάση");
        power = sc.nextInt();
        base = sc.nextInt();

        for (int i = 1 ; i <= power ; i++) {
            result *= base ;
            bigResult = bigResult.multiply(BigInteger.valueOf(base));
        }

        System.out.println(result);
        System.out.println(bigResult);
    }
}
