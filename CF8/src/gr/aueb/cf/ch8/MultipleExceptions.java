//package gr.aueb.cf.ch8;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.time.LocalDateTime;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class MultipleExceptions {
//
//    public static void main(String[] args) {
//        String numStr = "";
//        //Scanner scanner = null ;
//
//        try (Scanner scanner = new Scanner(new File("text.txt"));) {
//            while (!isInteger(numStr = scanner.nextLine())) {
//                System.out.println("Δώστε ξανά έναν ακέραιο.");
//            }
//            System.out.println(numStr);
//        } catch (FileNotFoundException | InputMismatchException e) {
//            System.err.println(LocalDateTime.now() + "Γενικό IO Error\n" + e); //logging
//        } catch (IOException e) {
//            System.out.println(LocalDateTime.now() + "\n" + e);
//        } catch (Exception e) {
//            System.out.println("" + e);
//    }
//    }
//
//    public static boolean isInteger(String s){
//        return s.matches("-?\\d+");
//    }
