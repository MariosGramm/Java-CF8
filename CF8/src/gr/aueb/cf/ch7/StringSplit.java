package gr.aueb.cf.ch7;

/**
 * Θέλουμε να διαχωρίσουμε ένα String σε substrings με βάση έναν delimiter
 */

public class StringSplit {

    public static void main(String[] args) {
        String s = "Athens:Uni:Of:And:Business";

        String[] tokens = s.split(":");


        for (String token : tokens) {
            System.out.print(token + " ");
        }
    }
}
