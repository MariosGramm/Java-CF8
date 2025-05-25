package gr.aueb.cf.ch6;

public class CopyWithArrayExample {

    public static void main(String[] args) {
        int[] arr = { 10 , 20 };

        System.out.printf( "%d , %d\n" , arr[0] , arr[1] );
        swap(arr);
        System.out.printf("%d , %d " , arr[0] , arr[1] );
    }

    public static void swap(int[] arr){
        if (arr.length != 2) return;

        int tmp = arr[0] ;
        arr[0] = arr[1];
        arr[1] = tmp;


    }
}
