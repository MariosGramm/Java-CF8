package gr.aueb.cf.ch6;

/**
 * Διασχίζει έναν πίνακα , δηλαδή επισκέπτεται μία - μία τις θέσεις του πίνακα και εκτυπώνει την τιμή της κάθε θέσης
 */

public class ArrayTraverse {

    public static void main(String[] args) {
        int[] arr1 = new int[5] ;
        int[] grades = {1,2,3,4,5} ;
        int[] arr3 = new int[] {2,4,6,8,10};

        //traverse for
        for (int i = 0 ; i < arr1.length ; i++) {
            System.out.println(arr1[i] + " ");
        }

        //enhanced for
        for (int item : arr1) {
            System.out.println(item + " ");
        }

        System.out.println();

        for (int grade : grades){
            System.out.println(grade + " ");
        }

    }

}
