package gr.aueb.cf.ch8;

/**
 * Γράψτε μία μέθοδο που δοσμένου ενός string s και ενός ακεραίου n επιστρέφει ένα string που αποτελεί επανάληψη του s , n φορές.
 * Επίσης γράψτε και άλλη μία έκδοση της παραπάνω μεθόδου που να λαμβάνει το string s και
 * ένα ακέραιο n και να επιστρέφει ένα string με τόσες επαναλήψεις ώστε το πλήθος των γραμμάτων του τελικού string να είναι αμέσως μεγαλύτερο από ένα ακέραιο, έστω n.
 */

public class Challenge2 {

    public static void main(String[] args) {
        int n = 2;
        String s = "abc" ;

        String string1 = stringMethod1(s,n);
        System.out.println(string1);

        String string2 = stringMethod2(s,n);
        System.out.println(string2);


    }

    public static String stringMethod1(String s , int n){
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i<n ; i++){
            sb.append(s);
        }

        return sb.toString();
    }

    public static String stringMethod2(String s , int n){
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < n + 1 ; i++){
            sb.append(s);
        }

        return sb.toString();
    }
}
