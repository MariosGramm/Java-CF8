package gr.aueb.cf.ch4.examples;

import java.util.Scanner;

public class SwitchExprAppExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade ;
        char classification ;

        System.out.println("Παρακαλώ δώστε βαθμό");
        grade = sc.nextInt();

        classification = switch (grade) {
            case 1,2,3,4 ->'F';
            case 5,6 -> 'G';
            case 7,8 -> 'D';
            case 9,10 ->'B';
            default -> '?';
        };

        System.out.println(classification);

    }
}
