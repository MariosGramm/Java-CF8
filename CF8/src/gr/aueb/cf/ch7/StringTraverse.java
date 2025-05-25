package gr.aueb.cf.ch7;

/**
 * Traverse a String one - by - one all the chars.
 * όχι με enhanced for . Αλλά με την κλασσική for .
 */
public class StringTraverse {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = 0 ; i < s.length() ; i++){
            System.out.println(s.charAt(i) + " ");
        }
        System.out.println();

        //prints the reversed string
        for (int i = s.length() - 1 ; i >= 0 ; i--){
            System.out.println(s.charAt(i) + " ");
        }
    }


}
