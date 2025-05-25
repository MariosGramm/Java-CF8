package gr.aueb.cf.ch6;

public class SumReducingExample {

    public static void main(String[] args) {
        int[] arr = new int[] { 1 , 5, 6, 8 , 29};

        int sum = getSum(arr);

        System.out.println(sum);


    }

    public static int getSum(int[] arr) {
        int sum = 0 ;

        for (int num : arr) sum += num;

        return sum ;
    }
}
