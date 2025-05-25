package gr.aueb.cf.ch4;

/**
 * Χρήση break με for
 */

public class ForBreakApp {

    public static void main(String[] args) {
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println(i + " ");
            if (i == 5) break ;
        }
    }
}
