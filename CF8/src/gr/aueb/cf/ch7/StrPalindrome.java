package gr.aueb.cf.ch7;

public class StrPalindrome {

    public static void main(String[] args) {
        String s ="AttAB";
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString().equals(s); //χρησιμοποιούμε stringbuilder για reverse
    }
}
