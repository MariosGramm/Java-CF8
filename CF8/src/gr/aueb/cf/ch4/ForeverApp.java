package gr.aueb.cf.ch4;

/**
 * for runs forever , idiomatic case
 */
public class ForeverApp {

    public static void main(String[] args) {
        int count = 1 ;

        for (;;) {
            System.out.println("forever");
            count++;
            if (count % 20 == 0 ) System.out.println();
            if (count == 100 ) break ;
        }
    }
}
