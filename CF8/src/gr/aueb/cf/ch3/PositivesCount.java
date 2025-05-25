package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μετράει το πλήθος των συνεχόμενων θετικών (συμπεριλαμβανομένου και του 0 ) που δίνει ο χρήστης
 */

public class PositivesCount {

    public static void main(String[] args) {
        int num = 0 , positivesCount = 0 ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ δώστε ένα νούμερο ");
        num = sc.nextInt();

        while (num >= 0){
            positivesCount++;
            System.out.println("Παρακαλώ δώστε το επόμενο νούμερο ");
            num = sc.nextInt();
        }

        System.out.println("Positive Count : " + positivesCount);
    }

}
