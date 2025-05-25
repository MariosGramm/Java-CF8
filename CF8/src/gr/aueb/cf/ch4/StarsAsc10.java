package gr.aueb.cf.ch4;

/**
 * Εκτύπωση 10 σειρών με αστεράκια όπου στην 1η σειρά 1 αστεράκι , στη 2η σειρά 2 αστεράκια μέχρι την 10 σειρά με 10 αστεράκια
 */

public class StarsAsc10 {

    public static void main(String[] args) {

        for ( int i = 1 ; i <= 10 ; i++){
            for (int j = 1 ; j <= i ; j ++) {
                System.out.print('*');
            }

            System.out.println();
        }
    }
}

