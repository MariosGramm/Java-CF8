package gr.aueb.cf.ch3;

/**
 * Δίνουμε αρχική και τελική τιμή , βήμα αύξησης και υπολογίζει το πλήθος των επαναλήψεων
 */
public class GenericWhileApp {

    public static void main(String[] args) {
        int start = 1 ;
        int endVal = 10 ;
        int step = 1;
        int iterations = 0 ;

        while (start <= endVal){
            iterations++;
            start += step ;
        }

        System.out.println("Iterations count : " + iterations);
    }
}
