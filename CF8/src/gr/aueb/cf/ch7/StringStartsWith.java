package gr.aueb.cf.ch7;

/**
 * StartsWith returns boolean.
 */

public class StringStartsWith {

    public static void main(String[] args) {
        String s = "Coding";

        if (s.startsWith("Cod")) {
            System.out.println("Starting with Cod...");}
        else {
            System.out.println("Not starting with Cod...");
        }

        if (s.startsWith("od",1)) {
            System.out.println("Starting with Cod...");}
        else {
            System.out.println("Not starting with Cod...");
        }
    }
}
