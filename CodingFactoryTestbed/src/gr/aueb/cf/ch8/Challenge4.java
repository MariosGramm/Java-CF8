package gr.aueb.cf.ch8;

/**
 * Έστω ένας πίνακας ακεραίων έστω ages που συμβολίζει ηλικίες (σε έτη),
 * και έστω η ηλικία age (σε έτη) ενός χαρακτήρα.
 * Γράψτε μία μέθοδο που λαμβάνει ως είσοδο τον πίνακα ages και την ηλικία age
 * και επιστρέφει την ηλικιακή διαφορά του χαρακτήρα από τη μέγιστη ηλικία του πίνακα.
 * Αν δεν υπάρχει ηλικιακή διαφορά επιστρέφει 0.
 */

public class Challenge4 {

    public static void main(String[] args) {
        int[] ages = { 20 , 40 , 35 , 80} ;
        int age  = 15 ;

        int ageGap = ageGapFinder(ages , age);

        System.out.println(ageGap);
    }

    public static int ageGapFinder(int[] ages , int age){
        int max = ages[0];

        for (int i = 1 ; i < ages.length ; i++){
            if (max < ages[i]) max = ages[i];
            }


        int ageGap = max - age ;

        if (ageGap < 0 ) return 0;
        return ageGap;
    }
}
