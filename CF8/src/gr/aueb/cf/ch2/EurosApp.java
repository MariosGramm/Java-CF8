package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EurosApp {

    public static void main(String[] args) {
        int euros500,euros100,euros50,euros10,euros5,euros,remainingEuros,inputEuros;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the amount of Euros: ");
        inputEuros = sc.nextInt();

        euros500 = inputEuros / 500 ;
        remainingEuros = inputEuros % 500 ;

        euros100 = remainingEuros / 100 ;
        remainingEuros = remainingEuros % 100 ;

        euros50 = remainingEuros / 50 ;
        remainingEuros = remainingEuros % 50 ;

        euros10 = remainingEuros / 10 ;
        remainingEuros = remainingEuros % 10 ;

        euros5 = remainingEuros / 5 ;
        remainingEuros = remainingEuros % 5 ;

        euros = remainingEuros;

        System.out.printf("%d : 500 euros , %d : 100 euros , %d : 50 euros , %d : 10 euros , %d : 5 euros , %d : euros", euros500 , euros100 , euros50 , euros10 , euros5 , euros);





    }
}
