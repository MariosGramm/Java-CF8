package gr.aueb.cf.ch1;

public class SubstractApp {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 4;
        int result = 0;

        result = num1 - num2;

        System.out.printf("The result of %d - %d is %d", num1, num2, result);
    }


    public static void analysis(String[] args) {

        System.out.printf("The type of the result is integer.This type has size of %d bytes , minimum value of %d and maximum value of %d" , Integer.BYTES , Integer.MIN_VALUE , Integer.MAX_VALUE  );

    }
}