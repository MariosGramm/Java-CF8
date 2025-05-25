package gr.aueb.cf.ch3;
/**
 * Έλεγχος όλων των περιπτώσεων
 */

import java.util.Scanner;

public class SecretIf2 {

    public static void main(String[] args) {
        final int NUMBER = 10 ;
        int inputNum ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Εισάγετε έναν αριθμο : ");
        inputNum = sc.nextInt();

        while (true){
            if (inputNum == NUMBER) {
                System.out.println("Well done");
                break;
            } else {
                System.out.println("Fail.Try again");
                System.out.println("Εισάγετε έναν αριθμο : ");
                inputNum = sc.nextInt();
            }
    }   }
}


