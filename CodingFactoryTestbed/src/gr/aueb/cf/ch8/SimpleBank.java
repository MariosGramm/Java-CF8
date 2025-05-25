package gr.aueb.cf.ch8;

import java.time.LocalDateTime;
import java.util.Scanner;

public class SimpleBank {
    static double balance = 500 ;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            deposit(-300);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            withdraw(1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void deposit(double amount) throws Exception {
        try {
            if (amount < 0) throw new Exception("Το ποσό κατάθεσης δεν μπορεί να είναι αρνητικό");
            balance += amount ;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + " " + e.getMessage());
            throw e ;   //rethrow να το δει η main
        }
    }

    public static void withdraw(double amount) throws Exception {
        try {
            if (amount > balance) throw new Exception("Το ποσό της ανάληψης υπερβαίνει το υπόλοιπο του λογαριασμού σας");
            balance -= amount ;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now() + " " + e.getMessage());
            throw e ;   //rethrow να το δει η main
        }
    }
}
