package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuApp2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0 ;
        final int EXIT = 3 ;


        while (true) {
            System.out.println("Κάντε μία επιλογή:");
            System.out.println("1.Add Product");
            System.out.println("2.Delete Product");
            System.out.println(("3.Exit "));
            choice = sc.nextInt();

            if (choice == EXIT) {
                break;
            }
        }
        System.out.println("Thank you!");
    }
}

