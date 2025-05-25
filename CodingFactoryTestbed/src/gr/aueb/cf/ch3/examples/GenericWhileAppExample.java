package gr.aueb.cf.ch3.examples;

public class GenericWhileAppExample {

    public static void main(String[] args) {
        int start = 0 , end = 10 , step = 1 , counter = 0;

        while (start < end){
            counter ++ ;
            start += step ;
        }

        System.out.println(counter);
    }
}
