package gr.aueb.cf.ch6;

/**
 * Αναζητά ένα στοιχείο σε έναν πίνακα και επιστρέφει την θέση του στοιχείου στον πίνακα ή -1 αν δεν υπάρχει το στοιχείο
 */
public class ArraySearch {

    public static void main(String[] args) {

    }

    /**
     * Επιστρέφει το πρώτο στοιχείο του πίνακα που ισούται με το value . Αν δεν υπάρχει το στοιχείο , επιστρέφει -1.
     * @param arr       ο input πίνακας.
     * @param value     η τιμή αναζήτησης.
     * @return          το position του πίνακα που βρέθηκε το στοιχείο , -1 otherwise.
     */
    public static int getPosition(int[] arr , int value) {
        int positionToReturn = -1 ;

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == value) {
                positionToReturn = i ;
                break;
            }
        }
        return  positionToReturn;
    }


}
