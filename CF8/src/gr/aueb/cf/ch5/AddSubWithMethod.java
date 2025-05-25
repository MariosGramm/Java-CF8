package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * υπολογίζει το άθροισμα δύο ακεραίων με την χρήση μεθόδων.
 */

public class AddSubWithMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        int sub ;

        System.out.println("Παρακαλώ εισάγετε 2 ακεραίους :");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        sum = AddSubWithMethod.add(num1, num2);       //invoke - call την μέθοδο add
        sub = AddSubWithMethod.sub(num2 , num1);

        System.out.println("Το άθροισμα είναι: " + sum);
        System.out.println("Sub: " + sub);

    }

    /**
     * Adds two integers
     *
     * @param a the first integer to add
     * @param b the second integer to add
     * @return the sum of a and b .
     */
    public static int add(int a, int b) {
        return a + b;
    }

//    public static int add(int a , int b) {
//        int sum = 0 ;
//        sum = a+b ;
//        return sum ;
//    }


    /**
     * @param a the first integer to substract from
     * @param b the second integer to substract from
     * @return the substraction a - b
     */
    public static int sub(int a, int b) {
        return a - b;
    }
}