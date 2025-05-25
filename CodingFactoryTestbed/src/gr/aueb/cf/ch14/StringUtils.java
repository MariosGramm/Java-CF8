package gr.aueb.cf.ch14;

import gr.aueb.cf.ch7.StringIOexample;

public class StringUtils {

    private StringUtils(){

    }

    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString();
    }

    public static String uppercaseString(String s){return s.toUpperCase();}

    public static boolean isPalindrome(String s){return reverseString(s).equals(s);}
}
