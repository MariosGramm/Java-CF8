//package gr.aueb.cf.ch6;
//
//public class BinarySearchExample {
//
//    public static void main(String[] args) {
//
//    }
//
//    public static int BinarySearch(int[] arr ,int value ,  int low , int high){
//        if (arr == null) return -1 ;
//        if (low > high) return -1 ;
//        if (low < 0 || high > arr.length - 1) return -1 ;
//
//        int mid = (high + low) / 2 ;
//
//        if (arr[mid] == value) {
//            return mid;}
//        else if (arr[mid] > value) {
//            return BinarySearch(arr , value , mid + 1 , high);}
//        else
//            return BinarySearch(arr , value , low , mid-1);}
//
//
//        }
//    }
//}
