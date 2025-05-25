package gr.aueb.cf.ch4.examples;

public class SumMulAppExample {

    public static void main(String[] args) {
        int mul = 1 ;
        int sum = 0 ;

        for ( int i = 1 ; i <= 10 ; i++){
            sum += i ;
            mul *= i ;
        }

        System.out.println(mul);
        System.out.println(sum);
    }
}
