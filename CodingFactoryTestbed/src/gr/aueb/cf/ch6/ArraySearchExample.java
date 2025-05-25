package gr.aueb.cf.ch6;

import java.util.Scanner;

public class ArraySearchExample {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 , 4 , 5 , 6};
        int pos,value ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε τιμή");
        value = sc.nextInt();

        pos = positionToReturn(arr,value);

        System.out.printf("Η θέση είναι : %d ",pos);
    }

    public static int positionToReturn(int[] arr,int value){
        int position = -1;

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == value) {
                position = i ;
            }
        }
        return position;
    }
}
