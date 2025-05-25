package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει έναν ακέραιο από 1 - 10 και υπολογίζεται ως output ο πολλαπλασιασμός του ακεραίου με όλους τους ακέραιους από 1 - 10.
 */

public class MultiplicationTable {

    public static void main(String[] args) {
        int num = 0 , i = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ δώστε τιμή ");
        num = sc.nextInt();

        while (i <= 10) {
            System.out.printf("%d * %d = %d\n" , num , i , num * i);
            i++;
        }

    }
}
