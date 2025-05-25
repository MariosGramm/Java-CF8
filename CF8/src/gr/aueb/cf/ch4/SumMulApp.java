package gr.aueb.cf.ch4;

/**
 * Υπολογίζει το άθροισμα και το γινόμενο των 10 πρώτων αριθμών
 */

public class SumMulApp {

    public static void main(String[] args) {
        int sum = 0 ;
        int mul = 1 ;

        for (int i = 1 ; i <= 10 ; i++){
            sum += i;
            mul *= i;

        }
        System.out.println("Sum is " + sum + " Mul is " + mul);
    }
}
