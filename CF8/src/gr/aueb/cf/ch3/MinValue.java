package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MinValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int min;

        System.out.println("Παρακαλώ εισάγετε 2 ακεραίους ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

//        if (num1 < num2) {
//            min = num1 ;
//        } else {
//            min = num2 ;
//        }

        min = (num1 > num2) ? num1 : num2 ; //turnary


    }
}
