package gr.aueb.cf.ch2;

import java.util.Scanner;

public class MathPowers {

    public static void main(String[] args) {

        int num ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Παρακαλώ δώστε έναν αριθμό: ");
        num = sc.nextInt();

        System.out.printf("Cube : %d , Square : %d", (int)Math.pow(num,3) , (int)Math.pow(num,2));

    }
}
