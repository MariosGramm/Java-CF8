package gr.aueb.cf.ch5.examples;

import java.util.Scanner;

public class PowerRecursiveExample {

    public static void main(String[] args) {
        int base , power ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε την βάση και την δύναμη");
        base = scanner.nextInt();
        power = scanner.nextInt();

        System.out.println(powerres(base , power));

    }

    public static int powerres(int base , int power){
//        if (power == 0) return 1;
//        return base * powerres(base , power -1 );

        return (power == 0) ? 1 : base * powerres(base , power - 1);
    }
}
