package gr.aueb.cf.ch7;

import java.math.BigInteger;

/**
 * From primitive data types to String.
 * From class to string.
 */
public class StringTypecast {

    public static void main(String[] args) {
        double myDouble = 3.5 ;
        BigInteger bigInt = new BigInteger("1224343445432");

        String strDouble = String.valueOf(myDouble);
        String strInt = bigInt.toString();
    }
}
