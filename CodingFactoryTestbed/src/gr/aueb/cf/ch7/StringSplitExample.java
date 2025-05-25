package gr.aueb.cf.ch7;

public class StringSplitExample {

    public static void main(String[] args) {
        String s = "Coding:Factory";

        String[] tokens = s.split(":");

        for (String token : tokens){
            System.out.print(token + " ");
        }
    }
}
