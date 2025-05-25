package gr.aueb.cf.ch6.challenges;

import java.util.Scanner;

public class HighLowIndex {

    public static void main(String[] args) {
        int[] array = new int[] {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int[] lowHigh = new int[2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε το key");
        int key = scanner.nextInt();

        lowHigh = getLowAndHigh(array,key);

        for (int element : lowHigh){
            System.out.println(element);
        }
    }

    public static int[] getLowAndHigh(int[] array , int key) {
        int low = 0 , high = 0  ;

        for (int i = 0 ; i < array.length ; i++){
            if (array[i] == key) {
                low = i;
                break;
            }
        }


        for (int j = low; j < array.length ; j++){
            if (array[j] != key) {
                high = j -1 ;
                break;
            }

        }

        return new int[] {low, high};
    }
}
