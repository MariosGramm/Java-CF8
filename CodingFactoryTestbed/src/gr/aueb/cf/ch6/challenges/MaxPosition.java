package gr.aueb.cf.ch6.challenges;

public class MaxPosition {

    public static void main(String[] args) {
        int[] arr = new int[] {3,6,2,8,0};

        int maxPos = getMaxPosition(arr);

        System.out.printf("Η θέση του μέγιστου στον πίνακα είναι η %d" , maxPos);
    }

    public static int getMaxPosition(int[] arr){
        int max = arr[0];
        int pos = 0 ;

        for (int i = 1 ; i < arr.length ; i++){
            if (max < arr[i]) {
                pos = i ;
                max = arr[i];
            }
        }

        return pos ;
    }
}
