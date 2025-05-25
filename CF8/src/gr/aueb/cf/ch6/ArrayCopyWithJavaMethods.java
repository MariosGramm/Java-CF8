package gr.aueb.cf.ch6;

//import java.util.Arrays;

/**
 * Array copy using Java utility classes and methods.
 */

public class ArrayCopyWithJavaMethods {

    public static void main(String[] args) {

    }

    public static int[] addDeepCopy(int[] sourceArray) {
//        int[] destinationArray = new int[sourceArray.length];
//
//        System.arraycopy(sourceArray, 0 ,destinationArray , 0 ,sourceArray.length);

        int[] destinationArray ;
        destinationArray = java.util.Arrays.copyOf(sourceArray , sourceArray.length);
        destinationArray = java.util.Arrays.copyOfRange(sourceArray , 0 , sourceArray.length);

        return destinationArray;
    }
}
