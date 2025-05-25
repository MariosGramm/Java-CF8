package gr.aueb.cf.ch3;

/**
 * Boolean as conditional expressions
 */
public class BoolApp2 {

    public static void main(String[] args) {
        boolean isEven = false ;
        boolean isOdd ;
        boolean isHot ;
        int num = 10 ;
        int temp = 40 ;

        isHot = temp > 40 ;
        isEven = (num % 2) == 0 ;
        isOdd = !isEven ; //is0dd = num % 2 != 0
    }
}
