package gr.aueb.cf.ch7;

public class TraverseWithSubstring {

    public static void main(String[] args) {
        String s = "Coding";

        System.out.println(s);
        traverse(s);
    }

    public static void traverse(String s){
        for (int i = 0 ; i < s.length() ; i++)
            System.out.print(s.substring(i, i + 1));  //s.charAt(i)
    }
}
