package gr.aueb.cf.ch3.examples;

import java.util.Scanner;

public class SecretIfExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SECRET = 6;
        int inputNum = 0;

        System.out.println("Παρακαλώ εισάγετε έναν αριθμό: ");
        inputNum = sc.nextInt();

        while (true){
            if (inputNum == SECRET){
                System.out.println("Correct!");
            }else {
                System.out.println("Failure.Try again.For exit type 0.");
                inputNum = sc.nextInt();
                if (inputNum == 0) {
                    break;
                }
            }
        }

    }
}
