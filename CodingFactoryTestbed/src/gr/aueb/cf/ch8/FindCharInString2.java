package gr.aueb.cf.ch8;

public class FindCharInString2 {

    public static void main(String[] args) {

    }

    public static int getCount(String s , char ch , int n ) {
        String repeatedString = " ";
        int repeatedTimes;
        int count = 0 ;

        if (s.length() < n ) {
            repeatedTimes = (int) Math.ceil((double) n / s.length());
            repeatedString = s.repeat(repeatedTimes);
        }else repeatedString = s ;

        for (int i = 0 ; i < n ; i++){
            if (repeatedString.charAt(i) == ch) count ++;
        }

        return count;
    }

    public static int getCount2(String s , char ch , int n) {
        int count = 0 ;
        int iterations = 0 ;
        int totalCount = 0 ;
        int remaining = 0 ;

        for (int i = 0 ; i < s.length() ; i++){
            if (s.charAt(i) == ch) count++;
        }

        iterations = n / s.length();
        totalCount = iterations * count;

        remaining = n % s.length();
        for (int i = 0 ; i < remaining ; i++) {
            if (s.charAt(i) == ch) totalCount++;
        }
        return totalCount;
    }
}
