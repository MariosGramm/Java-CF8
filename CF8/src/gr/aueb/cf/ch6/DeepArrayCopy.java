package gr.aueb.cf.ch6;

/**
 * Αντιγραφή τα περιεχόμενα των πινάκων που στην περίπτωση μας είναι primitives , οπότε έχουμε deep copy.
 */

public class DeepArrayCopy {

    public static void main(String[] args) {
        int[] initialArray = { 1, 2 ,3 };
        int[] arrayCopy ;

        arrayCopy = arrDeepCopy(initialArray);

        for (int element : arrayCopy){
            System.out.println(element + " ");
        }
    }

    public static int[] arrDeepCopy(int[] sourceArray){
        int[] destinationArray = new int[sourceArray.length];

        for ( int i = 0 ; i < sourceArray.length ; i ++) {
            destinationArray[i] = sourceArray[i];
        }

        return destinationArray;
    }
}
