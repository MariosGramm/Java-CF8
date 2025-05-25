package gr.aueb.cf.ch4;

/**
 * demo for surrogate pairs
 */

public class UnicodeApp {

    public static void main(String[] args) {
        int codepoint = 0x1F60A; //το wrapper class μετατρέπει σε U+D83D U+DE03
        System.out.println(Character.toChars(codepoint));
    }
}
