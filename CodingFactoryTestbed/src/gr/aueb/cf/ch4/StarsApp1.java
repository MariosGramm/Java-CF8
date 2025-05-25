package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsApp1 {

    public static void main(String[] args) {
        int n ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ δώστε το πλήθος");
        n = scanner.nextInt() ;

        for (int i = 1 ; i <= n ; i ++) System.out.print('*');
    }
}
