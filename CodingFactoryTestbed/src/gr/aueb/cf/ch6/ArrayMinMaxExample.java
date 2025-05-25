package gr.aueb.cf.ch6;

import java.util.Scanner;

public class ArrayMinMaxExample {

    public static void main(String[] args) {
        int[] arr = new int[5];
        int minPos , maxPos ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε τα 5 στοιχεία του array");
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();
        arr[3] = scanner.nextInt();
        arr[4] = scanner.nextInt();

        minPos = getMinPos(arr);
        maxPos = getMaxPos(arr);

        System.out.printf("Το ελάχιστο είναι ο αριθμός %d , στην θέση %d\n", arr[minPos] , minPos);
        System.out.printf("Το μέγιστο είναι ο αριθμός %d , στην θέση %d", arr[maxPos] , maxPos);
    }

    public static int getMinPos(int[] arr){
        int pos = 0;
        int min = arr[pos];

        for ( int i = 1 ; i < arr.length ; i++){
            if (min > arr[i]) {
                min = arr[i];
                pos = i ;
            }
        }
        return pos;
    }

    public static int getMaxPos(int[] arr){
        int pos = 0;
        int max = arr[pos];

        for ( int i = 1 ; i < arr.length ; i++){
            if (max < arr[i]) {
                max = arr[i];
                pos = i ;
            }
        }
        return pos;
    }


}
