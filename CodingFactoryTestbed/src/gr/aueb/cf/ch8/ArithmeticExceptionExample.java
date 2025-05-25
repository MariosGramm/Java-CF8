package gr.aueb.cf.ch8;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {


        int num1 = 1;
        int num2 = 0;

        try {
            int result = num1 / num2;
        } catch (ArithmeticException e ) {
            System.out.println("Δεν δύναται διαίρεση με το 0");
        } finally {
            System.out.println("This line will be executed");
        }
    }
}
