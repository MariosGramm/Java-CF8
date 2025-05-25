package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Demo with arrays and methods.
 * Πως περνλαμε πίνακες ως παραμέτρους μεθόδους.
 */

public class ArraysAndMethods {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        printArray(arr,0, arr.length);

    }

    /**
     * Prints the elements of an array
     * @param arr the input array
     */

    public static void printArray(int[] arr) {
        arr[0] = 1000; //διατηρούνται οι αλλαγές και εκτός της μεθόδου
        for (int el : arr) {
            System.out.println(el + " ");
        }

    }

    /**
     * Overloaded version of for with boundaries.
     * Print an array slice from 'low' to 'high'
     * that is from low till high -1 . High is not
     * inclusive .Checks for edge cases : low < 0
     * and high
     * @param arr
     * @param low
     * @param high
     */
    public static void printArray (int[] arr , int low , int high) {

        if (low < 0 || high > arr.length) {
            return;
        }

        if (low > high) {
            return ; }


        for (int i = low ; i < high ; i++) {System.out.println(arr[i] + " ");}


    }
    }


