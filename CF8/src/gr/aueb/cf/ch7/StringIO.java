package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Input/Output in Strings.
 */

public class StringIO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = " ";
        String s2 = " ";

        System.out.println("Παρακαλώ εισάγετε δύο αλφαριθμητικά");
        s1 = scanner.next();    //διαβάζει μέχρι να βρει whitespace(spaces,tab,new Line)
        s2 = scanner.nextLine();    //διαβάζει μέχρι να βρει new Line ( μέχρι να πατήσουμε enter)

        System.out.printf("s1 = %s\n" , s1);
        System.out.printf("s2 = %s\n" , s2);
    }
}
