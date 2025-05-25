package gr.aueb.cf.ch5.examples;

/**
 * Ανταλλαγή τιμών δύο μεταβλητών
 */

public class SwapExampleAppExample {

    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;

        System.out.printf("a = %d , b = %d \n" , a , b);
        swap(a , b);
        System.out.printf("a = %d , b = %d \n" , a , b);
    }

    public static void swap(int num1 , int num2) {
        int temp = num1 ;

        num1 = num2 ;
        num2 = temp ;
    }
}
