package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Κατηγοριοποιεί τα προβλήματα των συλλογών δεδομένων(όπως οι πίνακες) σε 3 κατηγορίες.
 * 1.Filtering
 * 2.Mapping
 * 3.Aggregate methods
 */

public class ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr = {1, 10, 11, 17, 21, 34, 50};
    }

    //Filtering
    public static int[] filterEven(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        int[] arrayToReturn = new int[arr.length];
        int count = 0;


        for (int el : arr) {
            if (el % 2 == 0) arrayToReturn[count++] = el;

        }
        return Arrays.copyOf(arrayToReturn, count);
    }

    //Mapping
    public static int[] mapToDouble(int[] arr) {
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }

        return mapped;

    }

    //Reducing
    public static int sum ( int[] arr) {
        int sum = 0 ;

        for (int num : arr) {
            sum += num;
        }
        return sum ;

    }

    public static double avg(int[] arr ) {
        int sum = sum(arr);

        return (sum / (double)arr.length);
    }

    public static boolean anyEven(int[] arr) {
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] % 2 == 0) return true;
        }
        return false;
    }

    public static boolean allEven(int[] arr) {
        for (int element : arr) {
            if (element % 2 != 0) return false;
        }

        return true;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        int count = 0 ;

        for (int element : arr) {
            if (element % 2 != 0) count += 1 ;
        }
        return count > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {

        for (int i = 0 ; i < arr.length - 2 ; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2) return true;
        }
        return false;
    }

    public static boolean moreThanTwoWithTheSameEnding(int[] arr) {
        //int[] endings = new int[10];
        int count = 0 ;

        for (int i = 0 ; i < arr.length - 2 ; i++) {
            if ((arr[i] % 10 == arr[i+1] % 10) && (arr[i+1] % 10 == arr[i+2] % 10)) {
                //endings[i] = arr[i] % 10 ;
                count += 1 ;
            }
        }

        return count > 2;

    }
}


//    public static boolean moreThanTwoWithTheSameEnding(int[] arr) {
//        int[] endings = new int[10];
//
//        for (int num : arr) {
//            if (++endings[num % 10] > 2) return true;
//        }
//    }
//}


