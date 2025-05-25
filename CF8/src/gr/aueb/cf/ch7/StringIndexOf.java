package gr.aueb.cf.ch7;

/**
 * Βρίσκει την θέση ενός χαρακτήρα ή και substring μέσα σε ένα string.
 */

public class StringIndexOf {


    public static void main(String[] args) {
        String cf = "Coding Factory ";

        int positionOfo = cf.indexOf("o");  //1
        System.out.println(positionOfo);

        int positionOfNextO = cf.indexOf("o",2);    //11
        System.out.println(positionOfNextO);

        int positionOfLastO = cf.lastIndexOf("o");  //11
        System.out.println(positionOfLastO);
    }
}
