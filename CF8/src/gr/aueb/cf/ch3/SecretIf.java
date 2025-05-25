package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ο χρήστης εισάγει έναν ακέραιο αριθμό και προσπαθεί να μαντέψει έναν μυστικό αριθμό .
 */

public class SecretIf {

    public static void main(String[] args) {
        final int NUMBER = 10 ;
        int inputNum ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Εισάγετε έναν αριθμο : ");
        inputNum = sc.nextInt();

        if (inputNum == NUMBER) {
            System.out.println("Well done");
        }
    }
}
