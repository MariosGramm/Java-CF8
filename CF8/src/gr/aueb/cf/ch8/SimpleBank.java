package gr.aueb.cf.ch8;

import java.time.LocalDateTime;

/**
 * Η simple bank παρέχει μία νόνο υπηρεσία , την υπηρεσία κατάθεσης(deposit).
 */
public class SimpleBank {
    static double balance = 0 ;

    public static void main (String[] args) {
        try {
            deposit(-100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     *
     * @param amount the amount of money.
     */
    public static void deposit(double amount) throws Exception{
        try {
            if (amount < 0) throw new Exception("Το ποσό κατάθεσης πρέπει να είναι μη-αρνητικό");
            balance += amount ;
        } catch (Exception e ) {
            System.err.println(LocalDateTime.now() + "\n" + e);//logging
            throw e;
        }


    }


}
