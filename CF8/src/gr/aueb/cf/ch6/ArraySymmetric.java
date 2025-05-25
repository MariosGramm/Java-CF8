package gr.aueb.cf.ch6;

/**
 * Ελέγχει αν ένας πίνακας είναι συμμετρικός ή όχι .
 */

public class ArraySymmetric {

    public static void main(String[] args) {

    }

    public static boolean isArraySymmetric(int[] arr) {
        boolean isSymetric = true ;
        for (int i = 0 , j = arr.length - 1 ; i < j; i++ , j--){
            if (arr[i] != arr[j]){
                //return false ;
                isSymetric = false ;
                break ;
            }
        }
        return isSymetric;
    }

    public static boolean isSymmetric(int[] arr) {

        for (int i = 0 ; i < arr.length / 2 ; i++) {
            if (arr[i] != arr[arr.length - i - 1]){
                return false ;
            }
        }

        return true;
    }
}
