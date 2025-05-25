package gr.aueb.cf.ch4.examples;

import java.math.BigDecimal;

public class BigDecimalAppExample {

    public static void main(String[] args) {
        BigDecimal actual = new BigDecimal("0.0");
        BigDecimal expected = new BigDecimal("1.0");

        for (int i = 1 ; i <= 10 ; i ++){
            actual = actual.add(BigDecimal.valueOf(0.1));
        }

        System.out.println(expected);
        System.out.println(actual);

        if (actual.equals(expected)) System.out.println("EQUAL");
        else System.out.println("NOT EQUAL");
    }
}
