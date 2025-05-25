package gr.aueb.cf.ch4.examples;

import java.util.Scanner;

public class PowerAppForExample {

    public static void main(String[] args) {
        int power , base ;
        int result = 1 ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ δώστε δύναμη και βάση ");
        power = sc.nextInt();
        base = sc.nextInt();

        for (int i = 1 ; i <= power ; i++){
            result *= base;
        }

        System.out.println(result);
    }
}
