package gr.aueb.cf.ch3.examples;

/**
 * Boolean expressions
 */

public class BooleanApp2Example {

    public static void main(String[] args) {
        boolean isOdd = false ;
        int num = 19 ;

        isOdd = (num % 2 == 1);

        System.out.println("The number " + num + " is odd: " + isOdd);
    }
}
