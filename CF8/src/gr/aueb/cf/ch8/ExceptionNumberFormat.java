package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Συμβαίνει όταν αποτυγχάνει η IntegerParseInt
 */

public class ExceptionNumberFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 ;
        String inputStr ="";

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο");

        while ( !isInteger(inputStr = scanner.nextLine())) {
            System.out.println("Παρακαλώ δώστε νέο ακέραιο , οι χαρακτήρες δεν είναι αποδεκτοί");
        }
        num1 = Integer.parseInt(inputStr);
        System.out.println(num1);
    }

    public static boolean isInteger(String s){
        return s.matches("-?\\d+");
    }
}
