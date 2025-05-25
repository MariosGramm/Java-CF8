package gr.aueb.cf.ch2;

import java.util.Scanner ;

public class MenuOpApp {

    public static void main(String[] args) {

        int num1,num2 ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε 2 ακέραιους αριθμούς: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.printf("Πρόσθεση: %d \n", num1 + num2 );
        System.out.printf("Αφαίρεση: %d \n", num1 - num2 );
        System.out.printf("Πολλαπλασιασμός : %d \n", num1 * num2);
        System.out.printf("Div : %d \n" , num1 / num2);
        System.out.printf("Mod : %d \n" , num1 % num2);

    }
}
