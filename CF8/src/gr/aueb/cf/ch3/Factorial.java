package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του ακεραιου αριθμού n (n!) και ισούται με 1*2*3*....*n
 */

public class Factorial {

    public static void main(String[] args) {
        int N = 1;
        int n;
        int i = 1 ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ δώστε ακέραιο αριθμό");
        n = sc.nextInt();

        while (i <= n ){
            N *= i;
            i++;

        }

        System.out.println(N);
    }
}
