package gr.aueb.cf.ch6;

public class ArrayShallowCopyExample {

    public static void main(String[] args) {
        int[] arr = { 1 , 2, 3, 4, 5 , 6 };
        int[] arrayCopy = arr;

        arrayCopy[0] = 100 ;

        System.out.println(arr[0]);
    }
}
