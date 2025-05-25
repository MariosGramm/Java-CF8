package gr.aueb.cf.ch7;

import java.util.Scanner;

public class CaesarsAlgorithm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Παρακαλώ εισάγετε την λέξη προς κρυπτογράφηση");
        String s1 = scanner.nextLine();


        System.out.printf("%s encrypted είναι %s" , s1 , encrypted(s1) );
        System.out.println();

        System.out.println("Παρακαλώ εισάγετε την λέξη προς αποκρυπτογράφηση");
        String s2 = scanner.nextLine();

        System.out.printf("%s decrypted είναι %s" , s2 , decrypted(s2) );

    }

    public static String encrypted(String string) {
        if (string.equals(" ")) return " " ;


        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < string.length() ; i++){
            char current =  string.charAt(i);

            if (Character.isLetter(current)){
                if (current == 'z') sb.append((char)('a' + 2 ));
                else if (current == 'Z') sb.append((char)('A' + 2 ));
                else sb.append((char)(current + 3));
            }else sb.append(current);
        }

        return sb.toString();
    }

    public static String decrypted(String string) {
        if (string.equals(" ")) return " ";

        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < string.length() ; i++){
            char current = string.charAt(i);

            if (Character.isLetter(current)) {
                if (current == 'a') sb.append((char)('z' - 2 ));
                else if (current == 'A') sb.append((char)('Z' - 2 ));
                else sb.append((char) (current - 3));
            }else sb.append(current);
        }

        return sb.toString();
    }
}
