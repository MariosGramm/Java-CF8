package gr.aueb.cf.ch6.challenges;

public class ArrayMethods1 {

    public static void main(String[] args) {
        int[] arr = new int[] { 2 , 5 , 1 , 3 , 9 };

        int searchPos = getSearchPos(arr , 3 );

        System.out.printf("Η θέση του στοιχείου που αναζητάτε είναι η %d" , searchPos);

        printEvens(arr);

        int[] doubles = getDoubles(arr);

        for (int doubleNum : doubles) System.out.println(doubleNum);

        boolean positives = getPositives(arr);

        System.out.println(positives);

        boolean allPositives = getAllPositives(arr);

        System.out.println(allPositives);



    }

    public static int getSearchPos(int[] arr , int value){

        for (int i = 0 ; i < arr.length ; i ++ ){
            if (arr[i] == value){
                return i ;
            }
        }
        return -1 ;
    }

    public static void printEvens(int[] arr){
        for (int i = 0 ; i < arr.length ; i ++){
            if (arr[i] % 2 == 0 ) System.out.println(arr[i]);
        }
    }

    public static int[] getDoubles(int[] arr){
        int[] temp = new int[arr.length];

        for (int i = 0 ; i < arr.length ; i++){
            temp[i] = arr[i] * 2;
        }

        return temp;
    }

    public static boolean getPositives(int[] arr){
        for (int i = 0 ; i < arr.length ; i ++){
            if (arr[i] > 0) return true;
        }

        return false;
    }

    public static boolean getAllPositives(int[] arr){
        int countPositives = 0;

        for (int element : arr){
            if (element > 0 ) countPositives += 1 ;
        }

        return countPositives == arr.length;
    }
}
