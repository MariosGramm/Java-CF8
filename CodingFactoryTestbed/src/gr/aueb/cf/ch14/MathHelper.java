package gr.aueb.cf.ch14;

public class MathHelper {

    private MathHelper(){

    }

    public static int MaxArray(int[] numbers){
        int max = numbers[0];
        for (int i = 1 ; i < numbers.length ; i++){
            if (max < numbers[i]){
                max = numbers[i];
            }
        }
        return max;
    }

    public static int MinArray(int[] numbers){
        int min = numbers[0];
        for (int i = 1 ; i < numbers.length ; i++){
            if (min > numbers[i]){
                min = numbers[i];
            }
        }
        return min;
    }

    public static int AverageArray(int[] numbers){
        int sum = 0 ;
        for (int number:numbers){
            sum +=number;
        }
        return (sum / (numbers.length + 1));
    }
}
