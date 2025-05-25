package gr.aueb.cf.ch6.challenges;

public class SecondMin {

    public static void main(String[] args) {
        int[] arr = new int[] { 1 , 3 , 5 , 8 };
        int sminPos  = 0 ;
        int minPos = 0 ;

        minPos = getMinPos(arr);

        arr[minPos] = 99999;

        sminPos = getMinPos(arr);

        System.out.printf("Η θέση του δεύτερου μικρότερου στοιχείου είναι %d " , sminPos);
    }

    public static int getMinPos(int[] array){
        int min = array[0] ;
        int minPos = 0 ;

        for (int i = 1 ; i < array.length ; i++){
            if ( min > array[i]){
                min = array[i];
                minPos = i;
            }
        }

        return minPos;
    }
}
