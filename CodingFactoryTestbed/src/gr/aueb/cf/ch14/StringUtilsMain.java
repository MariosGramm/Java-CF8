package gr.aueb.cf.ch14;

public class StringUtilsMain {

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "Aekara";

        System.out.println(StringUtils.reverseString(s2));
        System.out.println(StringUtils.uppercaseString(s1));
        System.out.println(StringUtils.isPalindrome(s1));
    }
}
