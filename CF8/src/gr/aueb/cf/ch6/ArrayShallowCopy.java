package gr.aueb.cf.ch6;

/**
 * Όταν κάνουμε copy references τότε το copy ονομάζεται shallow και έχει side effects.
 */

public class ArrayShallowCopy {

    public static void main(String[] args) {
        int[] initialArray = { 1 , 2 , 3 , 4 , 5 };
        int[] arrayCopy = initialArray ;    //αντιγραφή δεικτών.Reference copy

        arrayCopy[0] = 1000;
        System.out.println(initialArray[0]);
    }
}
