package gr.aueb.cf.ch3;


import java.util.Scanner;

public class SentinelApp2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0 ;
        int iterations = 0 ;

        System.out.println("Παρακαλώ εισάγετε έναν αριθμό :");

        while ((num = sc.nextInt()) != -1) {
            iterations ++;
            System.out.println("Παρακαλώ εισάγετε τον επόμενο ακέραιο ( -1 για έξοδο )");
        }

        System.out.printf("%d επαναλήψεις" , iterations);
    }
}
