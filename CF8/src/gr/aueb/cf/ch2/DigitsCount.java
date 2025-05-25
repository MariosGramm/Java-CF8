package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα των ψηφίων ενός διψήφιου ακεραίου που εισάγει ο χρήστης
 */
public class DigitsCount {

    public static void main(String[] args) {
        int InputNum = 0 , DigitsSum = 0 , LeftDigit = 0 , RightDigit = 0 ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε έναν διψήφιο ακέραιο αριθμό : ");
        InputNum = sc.nextInt();

        LeftDigit = InputNum / 10 ;
        RightDigit = InputNum % 10 ;
        DigitsSum = LeftDigit + RightDigit;

        System.out.printf("Input Number : %d , Left Digit : %d , Right Digit : %d , Sum of digits : %d", InputNum , LeftDigit , RightDigit , DigitsSum);




    }
}
