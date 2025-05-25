//package gr.aueb.cf.ch6;
//
//public class SelectionSortJavaExample {
//
//    public static void main(String[] args) {
//
//    }
//
//    public static int[] selectionSort(int[] arr){
//
//        for (int i = 0 ; i < arr.length - 1 ; i++ ){
//
//            int min = arr[i];
//            int minPosition = i ;
//
//            for (int j = i + 1 ; j < arr.length ; j++){
//                if (min == arr[j]) {
//                    min = arr[j];
//                    minPosition = j ;
//                }
//
//            }
//            swap(arr , minPosition , i);
//        }
//    }
//
//    public static void swap(int[] arr , int minPosition , int i ){
//        int tmp = arr[i];
//        arr[minPosition] = arr[i] ;
//        arr[i] = tmp;
//    }
//
//
//}
