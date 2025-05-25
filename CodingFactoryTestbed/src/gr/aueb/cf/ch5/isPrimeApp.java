package gr.aueb.cf.ch5;

import java.util.Scanner;

public class isPrimeApp {

    public static void main(String[] args) {
        boolean isprime = false;
        int n ;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Παρακαλώ εισάγετε έναν αριθμό");
        n = scanner.nextInt();

        isprime = isPrime(n);

        System.out.printf("Ο αριθμός %d είναι πρώτος : %b", n , isprime);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

