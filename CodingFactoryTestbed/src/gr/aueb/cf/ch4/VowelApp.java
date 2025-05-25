package gr.aueb.cf.ch4;

import java.util.Scanner;

public class VowelApp {

    public static void main(String[] args) {
        char letter , CLetter ;
        boolean isVowel = false ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Παρακαλώ εισάγετε ένα γράμμα");
        letter = scanner.nextLine().charAt(0);
        CLetter = Character.toUpperCase(letter);

        switch(CLetter){
            case 'Α' , 'Ε' , 'Η' , 'Ι' , 'Ο' , 'Ω' , 'Υ' -> isVowel = true;
        }

        System.out.println("Είναι φωνήεν : " + isVowel );


    }
}
