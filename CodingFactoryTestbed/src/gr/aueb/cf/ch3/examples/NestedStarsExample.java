package gr.aueb.cf.ch3.examples;

public class NestedStarsExample {

    public static void main(String[] args) {
        int i = 0 , j = 0 ;

        while (i < 5){
            j = 0 ;
            while (j < 10) {
                System.out.println("*");
                j++;
            }
            i++;
        }

    }
}
