package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη 2 ακεραίους και υπολογίζει με επαναληπτικό τρόπο την δύναμη base^power και εκτυπώνει το αποτέλεσμα
 */

public class PowerApp {

    public static void main(String[] args) {
        int base,power;
        int result = 1 ;
        int i = 1 ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ δώστε την βάση και την δύναμη");
        base = sc.nextInt();
        power = sc.nextInt();

        while (i <= power){
            result = result * base ;
            i++;

        }

        System.out.println(result);

        }





    }



