package gr.aueb.cf.ch4;

import java.util.Scanner;

public class CalculatorSwitch {

    public static void main(String[] args) {
        int num1,num2 ;
        char choice ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε 2 ακεραιους αριθμούς και διαλέξτε μαθηματική πράξη.( + , - , * , / )");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        scanner.nextLine();
        choice = scanner.nextLine().charAt(0);

        switch (choice) {
            case '+' -> System.out.println("Άθροισμα : " + (num1 + num2));
            case '-' -> System.out.println("Υπόλοιπο : " + (num1 - num2));
            case '*' -> System.out.println("Γινόμενο : " + (num1 * num2));
            case '/' -> System.out.println("Πηλίκο : " + (num1 / num2));
        }




    }
}
