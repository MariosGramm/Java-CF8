package gr.aueb.cf.ch5;

/**
 * Αμοιβαία ανταλλαγή των τιμών 2 μεταβλητών
 */
public class Swap {

    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;

        System.out.printf("a = %d , b = %d \n", a , b);
        swap(a ,b);
        System.out.printf("a = %d , b = %d \n", a , b);
    }

    public static void swap( int a , int b ) {
        int temp = a ;

        a = b ;
        b = temp ;
    }
}
