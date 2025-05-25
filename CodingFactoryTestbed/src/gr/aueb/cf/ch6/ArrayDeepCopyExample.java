package gr.aueb.cf.ch6;

public class ArrayDeepCopyExample {

    public static void main(String[] args) {
        int[] arr = { 1 , 2 , 3 , 4 , 5 , 6} ;
        int[] arrCopy ;

        arrCopy = arrDeepCopy(arr);

        for (int element : arrCopy){
            System.out.println(element + " ");
        }
    }

    public static int[] arrDeepCopy(int[] sourceArray){
        int[] Copy = new int[sourceArray.length];

        for (int i = 0 ; i < sourceArray.length ; i++ ){
            Copy[i] = sourceArray[i];
        }

        return Copy;

    }
}
