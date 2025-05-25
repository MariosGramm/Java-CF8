package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 *  χρήστης εισάγει 3 αριθμούς που αναπαριστούν τις πλευρές ενός ορθογωνίου τριγώνου και βλέπει αν το τρίγωνο είναι ορθογώνιο
 */
public class RightTriangle {

    public static void main(String[] args) {
        double a , b , c ;
        final double EPSILON = 0.0000005;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε την υποτείνουσα και τις δύο κάθετες πλευρές");
        a = sc.nextDouble() ;
        b = sc.nextDouble() ;
        c = sc.nextDouble() ;

        if (Math.abs((Math.pow(a,2)) - (Math.pow(b,2) + Math.pow(c,2))) <= EPSILON){
            System.out.println("Το τρίγωνο είναι ορθογώνιο");}
        else {
            System.out.println("Το τρίγωνο δεν είναι ορθογώνιο");
        }


    }
}
