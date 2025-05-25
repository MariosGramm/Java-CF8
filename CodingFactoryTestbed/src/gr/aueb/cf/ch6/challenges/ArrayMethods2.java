package gr.aueb.cf.ch6.challenges;

import java.util.Scanner;

public class ArrayMethods2 {

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε 6 αριθμούς από το 1 έως και το 49");
        for (int i = 0 ; i < array.length ; i++){
            array[i] = scanner.nextInt();
        }

        boolean threeEvens = evens(array);

        System.out.println(threeEvens);

    }

    public static boolean evens(int[] array){
        int countEvens = 0 ;

        for (int i = 0 ; i < array.length ; i++){
            if (array[i] % 2 == 0 ){
                countEvens += 1;
            }
        }

        return countEvens <= 3 ;
    }
}
