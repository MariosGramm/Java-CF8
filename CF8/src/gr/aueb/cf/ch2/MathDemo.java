package gr.aueb.cf.ch2;

public class MathDemo {

    public static void main(String[] args) {

        System.out.println("Η απόλυτη τιμή του αριθμού 5 είναι " + Math.abs(5));
        System.out.println("Τυχαία τιμή ανάμεσα στο 0 και στο 10 : " + ((Math.random()*11)+0));
        System.out.println("Τυχαία τιμή ανάμεσα στο 10 και στο 15 : " + ((Math.random()*6)+10));
        System.out.println("The min of 3 , 19 is : " + Math.min(3,19));
        System.out.println("The max of 3 , 19 is : " + Math.max(3,19));
    }
}
